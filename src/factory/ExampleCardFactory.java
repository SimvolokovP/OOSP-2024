package factory;

import models.Card;
import models.Rank;
import models.Suit;

public class ExampleCardFactory implements CardFactory {
    @Override
    public Card createCard(Rank rank, Suit suit) {
        return new Card(rank, suit);
    }
}
