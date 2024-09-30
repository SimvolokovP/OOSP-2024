import factory.ItalianRestaurantFactory;
import factory.RestaurantFactory;
import models.ItalianFood;

public class Main {
    public static void main(String[] args) {
        RestaurantFactory italianFactory = new ItalianRestaurantFactory();
        ItalianFood italianDish = italianFactory.getItalianFood();
        System.out.println("You order is " + italianDish.cook());
    }
}