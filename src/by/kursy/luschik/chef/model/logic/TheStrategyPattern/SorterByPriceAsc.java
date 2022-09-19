package by.kursy.luschik.chef.model.logic.TheStrategyPattern;

import by.kursy.luschik.chef.model.entity.Vegetable;

public class SorterByPriceAsc implements Comparable {
    @Override
    public boolean compare(Vegetable vegetable1, Vegetable vegetable2) {
        return vegetable1.getPrice() > vegetable2.getPrice();
    }
}
