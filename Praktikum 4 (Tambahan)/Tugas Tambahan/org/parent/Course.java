package org.parent;

import java.util.ArrayList;
import java.util.List;

public class Course {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

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
        /* TODO: buatlah fungsi untuk menampilkan seluruh 
           student yang mengambil course. 

           Hint: gunakan loop dan method getDetails dari Student
        */
        for (Student student : studentsEnrolled) {
            student.getDetails(student);
        }
    }

    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */
        System.out.println("Course Kode : " + this.getCourseCode());
        System.out.println("Nama Course : " + this.getCourseName());
        System.out.println("Dosen Pengampu : " + this.lecture.getNamaDosen());
        
        System.out.println(" ");
    }      

    // Other methods...
}
