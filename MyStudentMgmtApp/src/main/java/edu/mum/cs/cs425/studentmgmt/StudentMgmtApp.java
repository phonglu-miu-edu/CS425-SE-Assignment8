package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Date;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        new SpringApplicationBuilder(StudentMgmtApp.class).web(WebApplicationType.NONE).run(args);

    }

    @Override
    public void run(String... args) throws Exception {
        Transcript transcript = new Transcript("BS Computer Science");

        ClassRoom classRoom = new ClassRoom("McLaughlin building", "M105");

        Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, new Date("05/24/2019"));
        s1.setTranscript(transcript);
        s1.addClass(classRoom);

        saveStudent(s1);
    }

    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

}