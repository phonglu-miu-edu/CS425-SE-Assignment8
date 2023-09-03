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

/*
* In this assignment, do the following:

Task 1:

Implement simple Data Persistence with JPA.

The specification for a Student class is given as:

studentId : long (Primary key)
studentNumber : (required) (e.g. Data values: 000-61-0001, 000-61-0002, etc.)
firstName : (required) (e.g.  Data values: "Anna", "Bob" etc.)

middleName : (is optional) (e.g.  Data values: "Lynn", "" etc.)

lastName: (required) (e.g.  Data values: "Smith", "Galverston" etc.)
cgpa : (is optional) (e.g. Data values: 3.45, 2.87, etc)
dateOfEnrollment (This field contains date values; representing the date of enrollment of the student)

Create a Java console (command-line) application named, MyStudentMgmtApp. And in it, implement code for a Java persistent entity/class named, Student, including the data fields as has been specified above, and the accessor (getter) methods and mutator (setter) methods, and including any needed constructor(s). Make the class be inside a package named, edu.mum.cs.cs425.studentmgmt.model.

In the package named, edu.mum.cs.cs425.studentmgmt, create an executable Java class named, StudentMgmtApp. And in this class, implement a method named, saveStudent(), which takes as input a Student object and it saves/persists it to your database. Add code to the main method, that creates a Student object using the following data and invokes the saveStudent() method to save it to the database.

Student data: s1: { studentId:1, studentNumber: 000-61-0001, firstName:Anna, middleName: Lynn, LastName: Smith, cgpa:3.45, dateOfEnrollment:2019/5/24 }

Task 2:

1. Add a new entity named, Transcript (transcriptId: primaryKey, degreeTitle) to your solution above. Determine the relationship between Student entity and Transcript enity. And then implement JPA code for mapping and persisting/saving a student-and-transcript object data. Sample data: Transcript {1, "BS Computer Science"}

2. Add a new entity named, Classroom (classroomId: primaryKey, buildingName, roomNumber) to your solution above. Determine the relationship between Student entity and Classroom entity. And then implement JPA code for mapping and persisting/saving a student-and-classroom object data. Sample data: Classroom {1, "McLaughlin building", "M105"}

//-- Enjoy --//
* */