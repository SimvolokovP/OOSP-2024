package models;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String update(String estate, double price) {
        return "New message for " + name + ": new price of " + estate + " update to " + price + " rub.";
    }
}