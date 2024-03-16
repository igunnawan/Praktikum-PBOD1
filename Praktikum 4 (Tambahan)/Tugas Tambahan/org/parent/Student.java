/* 
 * File : Student.java
 * Penulis : Muhamad Gunawan / 24060122120016
 * Deskripsi : Kelas Student merupakan kumpulan object nama murid/student dimana terdapat atribut nama, age, address, StudentId, dan List Mata kuliah yang di ambil
 */

package org.parent;
import java.util.List;

import java.util.ArrayList;

public class Student {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student() {
        this.name = "-";
        this.age = 0;
        this.address = "-";
        this.studentID = 0;
        this.coursesEnrolled = new ArrayList<>();

    }
    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddres() {
        return this.address;
    }

    public void setStudentId(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentId() {
        return this.studentID;
    }

    public void getDetails(Student m1) {
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getAddres());
        System.out.println(m1.getStudentId());
    }

    public void enrollInCourse(Course course) {
       this.coursesEnrolled.add(course);           
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }

    public void removeCourse(Course course) {
        if (coursesEnrolled.contains(course)) {
            this.coursesEnrolled.remove(course);
        }
    }

    // Other methods...
}
