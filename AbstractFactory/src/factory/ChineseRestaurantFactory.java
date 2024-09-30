package factory;

import models.ChineseFood;
import models.ItalianFood;
import models.MexicanFood;
import models.SweetChicken;

public class ChineseRestaurantFactory implements RestaurantFactory {
    @Override
    public ItalianFood getItalianFood() {
        return null;
    }

    @Override
    public MexicanFood getMexicanFood() {
        return null;
    }

    @Override
    public ChineseFood getChineseFood() {
        return new SweetChicken();
    }
}
