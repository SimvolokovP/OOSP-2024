package factory;

import models.ChineseFood;
import models.ItalianFood;
import models.MexicanFood;
import models.Pizza;

public class ItalianRestaurantFactory implements RestaurantFactory{
    @Override
    public ItalianFood getItalianFood() {
        return new Pizza();
    }

    @Override
    public MexicanFood getMexicanFood() {
        return null;
    }

    @Override
    public ChineseFood getChineseFood() {
        return null;
    }
}
