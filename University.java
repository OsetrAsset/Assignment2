import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    // Constructor with parameters
    University(String name, ArrayList<Professor> professors, ArrayList<Course> courses) {
        setName(name);
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    University(String name) {
        setName(name);
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    // Getter and Setter for University Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Professor> getProfessors() {
        return professors;
    }
    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public Professor searchProfessorByName(String name) {
        return professors.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    public Course searchCourseByName(String name) {
        return courses.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("University: ").append(name).append("\n");
        sb.append("Professors: \n");
        for (Professor professor : professors) {
            sb.append(professor.toString()).append("\n");
        }
        sb.append("Courses: \n");
        for (Course course : courses) {
            sb.append(course.toString()).append("\n");
        }
        return sb.toString();
    }
}
