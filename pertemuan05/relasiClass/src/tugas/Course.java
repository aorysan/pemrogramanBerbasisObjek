package tugas;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private Instructor instructor;
    private List<Student> students;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getStudents() {
        return students;
    }
}