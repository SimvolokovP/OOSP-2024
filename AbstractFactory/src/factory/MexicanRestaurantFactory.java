package factory;

import models.ChineseFood;
import models.ItalianFood;
import models.MexicanFood;
import models.Tacos;

public class MexicanRestaurantFactory implements RestaurantFactory{
    @Override
    public ItalianFood getItalianFood() {
        return null;
    }

    @Override
    public MexicanFood getMexicanFood() {
        return new Tacos();
    }

    @Override
    public ChineseFood getChineseFood() {
        return null;
    }
}
