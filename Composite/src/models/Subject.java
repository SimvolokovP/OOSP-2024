package models;

public class Subject implements EducationalComponent{
    private String name;
    private int hoursLen;

    public Subject(String name, int hoursLen) {
        this.name = name;
        this.hoursLen = hoursLen;
    }

    @Override
    public void print() {
        System.out.println("New subject: " + name + " on " + hoursLen + " hours");
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", hoursLen=" + hoursLen +
                '}';
    }
}
