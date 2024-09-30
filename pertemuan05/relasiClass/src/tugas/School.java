package tugas;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;
    private List<Course> courses;
    private List<Instructor> instructors;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void enrollStudentInCourse(Student student, Course course) {
        student.addCourse(course);
        course.addStudent(student);
    }

    public void assignInstructorToCourse(Instructor instructor, Course course) {
        instructor.addCourse(course);
        course.setInstructor(instructor);
    }
}