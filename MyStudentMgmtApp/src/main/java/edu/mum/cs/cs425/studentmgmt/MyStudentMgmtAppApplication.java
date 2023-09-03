package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Date;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    private StudentMgmtApp studentMgmtApp;

    public static void main(String[] args) {
        new SpringApplicationBuilder(MyStudentMgmtAppApplication.class).web(WebApplicationType.NONE).run(args);

    }

    @Override
    public void run(String... args) throws Exception {
        Transcript transcript = new Transcript();
        transcript.setDegreeTitle("BS Computer Science");
        studentMgmtApp.saveTranscript(transcript);

        ClassRoom classRoom = new ClassRoom();
        classRoom.setBuildingName("McLaughlin building");
        classRoom.setRoomNumber("M105");
        studentMgmtApp.saveClassRoom(classRoom);

        Student s1 = new Student(1, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, new Date("05/24/2019"));
        s1.setTranscript(transcript);
        s1.addClass(classRoom);
        studentMgmtApp.saveStudent(s1);
    }

}