package edu.mum.cs.cs425.studentmgmt.model;

import java.util.Date;

@Entity
public class Student {
    long studentId;
    String studentNumber;
    String firstName;
    String middleName;
    String lastName;
    double cgpa;
    Date dateOfEnrollment;

    public Student(String studentNumber, String firstName, String lastName) {
        setStudentNumber(studentNumber);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Student(long studentId, String studentNumber, String firstName, String middleName, String lastName, double cgpa, Date dateOfEnrollment) {
        this(studentNumber, firstName, lastName);
        setStudentId(studentId);
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
}
