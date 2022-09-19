package by.kursy.luschik.chef.model.logic.TheIteratorPattern;

import by.kursy.luschik.chef.model.entity.Vegetable;

public interface Iterator {
    Vegetable next();
    boolean hasNext();
    void reset();
}
