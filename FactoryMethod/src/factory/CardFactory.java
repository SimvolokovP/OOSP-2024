package factory;

import models.Card;
import models.Rank;
import models.Suit;

public interface CardFactory {
    Card createCard(Rank rank, Suit suit);
}