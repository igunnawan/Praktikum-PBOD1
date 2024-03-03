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

    Student(String name, int age, String address, int studentID) {
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

    void getDetails(Student m1) {
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getAddres());
        System.out.println(m1.getStudentId());
    }

    void enrollInCourse(Course course) {
       this.coursesEnrolled.add(course);           
    }

    void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }

    void removeCourse(Course course) {
        if (coursesEnrolled.contains(course)) {
            this.coursesEnrolled.remove(course);
        }
    }

    // Other methods...
}
