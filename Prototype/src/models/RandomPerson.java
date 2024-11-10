package models;

import java.util.Random;

public class RandomPerson extends Person {
    private Random random = new Random();
    public RandomPerson() {
        this.name = Names.getRandomName().name();
        this.age = random.nextInt(99);
        this.email = name.toLowerCase() + "@gmail.com";
    }
    public RandomPerson(RandomPerson randomPerson) {
        super(randomPerson);
    }

    @Override
    public Person clone() {
        return new RandomPerson(this);
    }
}
