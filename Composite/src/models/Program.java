package models;

import java.util.ArrayList;
import java.util.List;

public class Program implements EducationalComponent {
    private String name;
    private List<EducationalComponent> programList = new ArrayList<>();

    public Program(String name) {
        this.name = name;
    }

    public void addNewComponent(EducationalComponent component) {
        programList.add(component);
    }
    public void removeComponent(EducationalComponent component) {
        programList.remove(component);
    }
    public void removeComponent(int index) {
        programList.remove(index);
    }

    @Override
    public void print() {
        System.out.println("Program: " + name);
        for (EducationalComponent component : programList) {
            component.print();
        }
    }
}
