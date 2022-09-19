package by.kursy.luschik.chef.usercontainers.fixedarray;

import by.kursy.luschik.chef.model.container.AbstractContainer;
import by.kursy.luschik.chef.model.container.Container;
import by.kursy.luschik.chef.model.entity.Vegetable;

public class FixedArray extends AbstractContainer {
    public static final int DEFAULT_SIZE = 10;
    private Vegetable[] vegetables;
    private int current;

    public FixedArray() {
        vegetables = new Vegetable[DEFAULT_SIZE];
        current = 0;
    }

    public FixedArray(Vegetable[] vegetables) {
        this.vegetables = vegetables;
        current = vegetables.length;
    }

    public int size() {
        return current;
    }

    @Override
    public void set(int index, Vegetable vegetable) {
        vegetables[index] = vegetable;
    }

    public Vegetable get(int index) {
        return vegetables[index];
    }

    public void add(Vegetable vegetable) {
        if (current < vegetables.length) {
            vegetables[current++] = vegetable;
        }
    }

    public void remove(int index) {
        for (int i = index; i < current; i++) {
            vegetables[i] = vegetables[i + 1];
        }
        current--;
    }
}
