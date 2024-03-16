package org.child;
import java.util.List;
import java.util.ArrayList;

import org.parent.Course;
import org.parent.Student;

public class asprak extends Student{
    private List<Course> asisten_matakuliah;

    public asprak() {
        super();
        asisten_matakuliah = new ArrayList<>();
    }

    public asprak(String name, int age, String address ,int studentID) {
        super(name, age, address, studentID);
        asisten_matakuliah = new ArrayList<>();
    }

    public void set_asisten_matakuliah(List<Course> Course) {
        asisten_matakuliah = Course;
    }

    public List<Course> get_asisten_matakuliah() {
        return asisten_matakuliah;
    }

    public void add_asprak(Course Course) {
        asisten_matakuliah.add(Course);
    }

    public void display_praktikum() {
        for (Course course : asisten_matakuliah) {
            System.out.println(course.getCourseName());
        }
    }
}
