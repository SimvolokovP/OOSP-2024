package models;

import java.util.List;

public interface Estate {
    void registerNewObserver(Observer observer);
    void removeObserver(Observer observer);
    List<String> notifyObservers();
}
