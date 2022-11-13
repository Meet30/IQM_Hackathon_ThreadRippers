package com.IQMhackathon.IQMhackathon.City;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

    @Column(name = "student_name")
    private String StudentName;

    @Id
    @Column(name = "contact_no")
    private String ContactNo;

    @Column(name = "nodal_point")
    private String NodalPoint;

    Student(){

    }

    public Student(String studentName, String contactNo, String nodalPoint) {
        StudentName = studentName;
        ContactNo = contactNo;
        NodalPoint = nodalPoint;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getNodalPoint() {
        return NodalPoint;
    }

    public void setNodalPoint(String nodalPoint) {
        NodalPoint = nodalPoint;
    }
}
