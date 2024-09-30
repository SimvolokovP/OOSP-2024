package factory;

import models.ChineseFood;
import models.ItalianFood;
import models.MexicanFood;

public interface RestaurantFactory {
    ItalianFood getItalianFood();
    MexicanFood getMexicanFood();
    ChineseFood getChineseFood();

}
