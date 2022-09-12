package by.kursy.luschik.chef.model.container;

import by.kursy.luschik.chef.model.entity.Vegetable;

public interface Container {
    boolean isEmpty();
    void set(int index, Vegetable vegetable);
    Vegetable get(int index);
    int size();
    void add(Vegetable vegetable);
    void remove(int index);
}
