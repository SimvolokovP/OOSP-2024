import models.Estate;
import models.RealProperty;
import models.User;

public class Main {
    public static void main(String[] args) {
        RealProperty car = new RealProperty("Car", 2200000);

        User user = new User("Mike");

        car.registerNewObserver(user);

        car.setPrice(2400000);

        car.notifyObservers();
    }
}
