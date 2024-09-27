import factory.CardFactory;
import factory.ExampleCardFactory;
import models.Card;
import models.Rank;
import models.Suit;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CardFactory factory = new ExampleCardFactory();
        Random random = new Random();
        Suit randomSuit = Suit.values()[random.nextInt(Suit.values().length)];
        Rank randomRank = Rank.values()[random.nextInt(Rank.values().length)];
        Card randomCard = factory.createCard(randomRank, randomSuit);
        System.out.println("Random card is: " + randomCard);
    }
}