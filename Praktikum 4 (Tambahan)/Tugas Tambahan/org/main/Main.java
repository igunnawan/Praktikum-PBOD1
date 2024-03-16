/* 
 * File : Main.java
 * Penulis : Muhamad Gunawan / 24060122120016
 * Deskripsi : Kelas Main untuk mengimplementasi kelas Student, Lecture, Course, asprak, dosen_wali
 */

package org.main;

import org.parent.*;
import org.child.*;


public class Main {
    public static void main(String[] args) {
      Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
      Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);
      
      Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
      Student dani = new Student("Dani", 20, "123 Oak St", 734621);
      Student edi = new Student("Edi", 20, "789 Pine St", 733451);
      
      Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
      Course cs102 = new Course("CS102", "Data Structures", bambang);
      Course cs103 = new Course("CS103", "Algorithms", agus);

      asprak asprak1 = new asprak("Cahyo",30, "ladala",132131);
      asprak asprak2 = new asprak("alwey", 17, "PK BIRU",40104);
      
      agus.teachCourse(cs101);
      agus.teachCourse(cs102);
      agus.teachCourse(cs103);

      bambang.teachCourse(cs102);
      bambang.teachCourse(cs103);
  
      cs101.addStudent(cahyo);
      cs101.addStudent(dani);
      cs101.addStudent(edi);
  
      cs102.addStudent(cahyo);
      cs102.addStudent(dani);
  
      cs103.addStudent(cahyo);

      System.out.println(" ");
      
      System.out.println("==================================================================== ");
      System.out.println("Mahasiswa bernama " + cahyo.getName() + " Mengambil Mata Kuliah : ");
      cahyo.viewEnrolledCourses();
      System.out.println("==================================================================== ");
      
      
      System.out.println("==================================================================== ");
      System.out.println(" ");
      agus.viewTaughtCourses();
      cs101.viewEnrolledStudents();

      asprak1.add_asprak(cs101);
      asprak1.display_praktikum();

      System.out.println(" ");
      System.out.println("Mahasiswa bernama " + asprak2.getName() + " Menjadi Asisten Praktikum dari mata kuliah : ");
      asprak2.add_asprak(cs101);
      asprak2.add_asprak(cs102);
      asprak2.add_asprak(cs103);
      asprak2.display_praktikum();
      
    }
  }
  