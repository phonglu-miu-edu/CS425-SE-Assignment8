package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long studentId;
    @Column(nullable = false)
    String studentNumber;
    @Column(nullable = false)
    String firstName;
    String middleName;
    @Column(nullable = false)
    String lastName;
    double cgpa;
    Date dateOfEnrollment;
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "transcript_id")
    Transcript transcript;
    @ManyToMany(cascade=CascadeType.PERSIST)
    @JoinTable(name = "student_classroom"
            , joinColumns = @JoinColumn(name = "student_id")
            , inverseJoinColumns = @JoinColumn(name = "class_id"))
    Set<ClassRoom> classRooms;

    public Student() {
    }

    public Student(String studentNumber, String firstName, String lastName) {
        setStudentNumber(studentNumber);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, Date dateOfEnrollment) {
        this(studentNumber, firstName, lastName);
        setMiddleName(middleName);
        setCgpa(cgpa);
        setDateOfEnrollment(dateOfEnrollment);
    }

    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Date getDateOfEnrollment() {
        return this.dateOfEnrollment;
    }

    public void setDateOfEnrollment(Date dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Transcript getTranscript() {
        return this.transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    public void addClass(ClassRoom classRoom) {
        this.classRooms = this.classRooms == null ? new HashSet<>() : this.classRooms;
        this.classRooms.add(classRoom);
    }
}
