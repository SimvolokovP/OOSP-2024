package models;

public class Pizza implements ItalianFood{
    @Override
    public String cook() {
        return "Pizza!";
    }
}
