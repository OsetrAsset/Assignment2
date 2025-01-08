public class Course {
    private int id;
    private static int id_gen = 1;
    private String name;
    private int credits;

    Course(){
        id = id_gen++;
    }

    Course(String name, int credits){
        this();
        setName(name);
        setCredits(credits);
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
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    @Override
    public String toString(){
        return "The course ID is " + id + ", it's called " + name + ", and it is worth " + credits + " credits.";
    }

}
