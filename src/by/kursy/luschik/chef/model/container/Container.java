package by.kursy.luschik.chef.model.container;

import by.kursy.luschik.chef.model.entity.Vegetable;

public interface Container {
    boolean isEmpty();
    Vegetable get(int index);
    int size();
    void set(int index,Vegetable vegetable);
    void add(Vegetable vegetable);
    void remove(int index);
}
