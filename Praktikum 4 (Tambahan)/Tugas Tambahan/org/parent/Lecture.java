/* 
 * File : Lecture.java
 * Penulis : Muhamad Gunawan / 24060122120016
 * Deskripsi : Kelas Lecture yang merupakan kumpulan object dosen-dosen, mulai dari nama, age, address, employeeID, List mata kuliah yang di ampu
 */

package org.parent;
import java.util.List;

import java.util.ArrayList;

public class Lecture {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture() {
        this.name = "-";
        this.age = 0;
        this.address = "-";
        this.employeeID = 0;
        this.coursesTaught = new ArrayList<>();
    }

    public Lecture(String name, int age, String address, int employeeID) {
        // TODO: buatlah fungsi konstruktor
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void setNamaDosen(String name) {
        this.name = name;
    }

    public String getNamaDosen() {
        return this.name;
    }

    public void setAgeDosen(int age) {
        this.age = age;
    }

    public int getAgeDosen() {
        return this.age;
    }

    public void setAddressDosen(String address) {
        this.address = address;
    }

    public String getAddressDosen() {
        return this.address;
    }

    public void setEmployeeId(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeId() {
        return this.employeeID;
    }

    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
        System.out.println("Nama Dosen :" + this.getNamaDosen());
        System.out.println("Age Dosen :" + this.getAgeDosen());
        System.out.println("Address Dosen :" + this.getAddressDosen());
        System.out.println("Employee Id :" + this.getEmployeeId());
    }    

    public void teachCourse(Course course) {
        if (!coursesTaught.contains(course)) {
            this.coursesTaught.add(course);
        }
    }

    public void viewTaughtCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course
           yang diampu oleh dosen.

           Hint: gunakan loop dan method getDetails dari Course
        */
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }

    // Other methods...
}
