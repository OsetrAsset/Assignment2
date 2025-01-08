import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Fitness", 5);
        Course course2 = new Course("Drama", 5);
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        Professor professor1 = new Professor("Billy", "Herrington", 300, "BillyHerrington@gmail.com", new ArrayList<>(List.of("Fitness")));
        Professor professor2 = new Professor("Van", "Darkholme", 339, "VanDarkholme@gmail.com", new ArrayList<>(List.of("Drama")));
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(professor1);
        professors.add(professor2);

        University university = new University("Gachi University", professors, courses);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addCourse(course1);
        university.addCourse(course2);
        System.out.println(university);
        System.out.println(university.searchCourseByName("Fitness"));
        System.out.println(university.searchProfessorByName("Billy"));
    }
}