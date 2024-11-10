import models.RandomPerson;

public class Main {
    public static void main(String[] args) {
        RandomPerson randomPerson1 = new RandomPerson();

        System.out.println(randomPerson1);

        System.out.println(randomPerson1.clone());
    }
}