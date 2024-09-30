package tugas;

public class Main {
    public static void main(String[] args) {
        School university = new School("School of Java");

        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Doe");

        Course course1 = new Course(1, "Java Programming");
        Course course2 = new Course(2, "Data Structures");

        Instructor instructor1 = new Instructor(1, "Dr. Java");
        Instructor instructor2 = new Instructor(2, "Dr. Jawa");

        university.addStudent(student1);
        university.addStudent(student2);

        university.addCourse(course1);
        university.addCourse(course2);

        university.addInstructor(instructor1);
        university.addInstructor(instructor2);

        university.enrollStudentInCourse(student1, course1);
        university.enrollStudentInCourse(student2, course2);

        university.assignInstructorToCourse(instructor1, course1);
        university.assignInstructorToCourse(instructor2, course2);

        System.out.println("Students enrolled in course 1:");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Instructor of course 1:");
        System.out.println(course1.getInstructor().getName());
        System.out.println();

        System.out.println("Students enrolled in course 2:");
        for (Student student : course2.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Instructor of course 2:");
        System.out.println(course2.getInstructor().getName());
    }
}