/* 
 * File : dosen_wali.java
 * Penulis : Muhamad Gunawan / 24060122120016
 * Deskripsi : Kelas dosen_wali yang merupakan kelas turunan/inheritence dari kelas Lecture
 */
package org.child;

import java.util.ArrayList;
import java.util.List;

import org.parent.Lecture;
import org.parent.Student;

public class dosen_wali extends Lecture {
    private List<Student> dosen_perwalian;

    public dosen_wali() {
        super();
        dosen_perwalian = new ArrayList<>();
    }
    
    public dosen_wali(String name, int age, String address, int employeeID) {
        super(name, age, address, employeeID);
        dosen_perwalian = new ArrayList<>();
    }

    public void set_dosen_wali(List<Student> students) {
        dosen_perwalian = students;
    }

    public List<Student> get_asisten_matakuliah() {
        return dosen_perwalian;
    }

    public void add_dosen_wali(Student student) {
        dosen_perwalian.add(student);
    }

    public void display_dosen_wali() {
        for (Student student : dosen_perwalian) {
            System.out.println(student.getName());
        }
    }
    
}
