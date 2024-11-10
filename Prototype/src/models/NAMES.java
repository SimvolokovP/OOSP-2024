package models;

import java.util.Random;

enum Names {
    ANDREW, ALEX, MAX, VASILY, ARTYOM;

    private static final Names[] VALUES = values();
    private static final Random RANDOM = new Random();

    public static Names getRandomName() {
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }
}