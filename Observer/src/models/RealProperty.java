package models;

import java.util.ArrayList;
import java.util.List;

public class RealProperty implements Estate{
    private List<Observer> observers;
    private String name;
    private double price;

    public RealProperty(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerNewObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public List notifyObservers() {
        List<String> updates = new ArrayList<>();
        for (Observer observer : observers) {
            String updateMessage = observer.update(name, price);
            updates.add(updateMessage);
        }
        return updates;
    }

    public void setPrice(double price) {
        this.price = price;
        List<String> updates = notifyObservers();
        for (String update : updates) {
            System.out.println(update);
        }
    }
}
