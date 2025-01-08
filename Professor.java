import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private int salary;
    private String email;
    private ArrayList<String> courses;

    Professor(){
        id = id_gen++;
        this.courses = new ArrayList<>();
    }

    Professor(String name, String surname, int salary, String email, ArrayList<String> courses){
        this();
        setName(name);
        setSurname(surname);
        setSalary(salary);
        setEmail(email);
        setCourses(courses);
    }

    Professor(String name, String surname, int salary, String email, String course){
        this(name, surname, salary, email, new ArrayList<>(List.of(course)));
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public ArrayList<String> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<String> courses){
        this.courses = courses;
    }
    public void addCourse(String course) {
        this.courses.add(course);
    }
    @Override
    public String toString(){
        return "Professor's ID is " + id + ", their name is " + name + " " + surname + ", the email is " + email + ", and they teach " + String.join(", ", courses);
    }

}
