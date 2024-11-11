package models;

public class Course implements EducationalComponent{
    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Course: " + name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
