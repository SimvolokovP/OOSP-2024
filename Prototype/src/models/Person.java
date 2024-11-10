package models;
abstract class Person implements Cloneable {
    protected String name;
    protected int age;
    protected String email;

    public Person() {
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.email = person.email;
    }

    public abstract Person clone();

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}