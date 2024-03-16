/* 
 * File : Course.java
 * Penulis : Muhamad Gunawan / 24060122120016
 * Deskripsi : Kelas Course yang merupakan kumpulan object nama pelajaran/course
 */

package org.parent;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseName(String coursename) {
        this.courseName = coursename;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addStudent(Student student) {
        if(!studentsEnrolled.contains(student)) {
            this.studentsEnrolled.add(student);
            student.enrollInCourse(this);
        }
    }

    public void removeStudent(Student student) {
        if(!studentsEnrolled.contains(student)) {
            this.studentsEnrolled.remove(student);
            student.removeCourse(this);
        }
    }

    public void viewEnrolledStudents() {
        for (Student student : studentsEnrolled) {
            student.getDetails(student);
        }
    }

    public void getDetails() {
        System.out.println("Course Kode : " + this.getCourseCode());
        System.out.println("Nama Course : " + this.getCourseName());
        System.out.println("Dosen Pengampu : " + this.lecture.getNamaDosen());
        
        System.out.println(" ");
    }      
}
