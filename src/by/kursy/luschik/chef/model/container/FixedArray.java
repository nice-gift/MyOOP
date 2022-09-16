package by.kursy.luschik.chef.model.container;

import by.kursy.luschik.chef.model.entity.Vegetable;

public class FixedArray {
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

    public boolean isEmpty() {
        return current == 0;
    }

    public int size() {
        return current;
    }

    public Vegetable get(int index) {
        return vegetables[index];
    }

    public void add(Vegetable vegetable) {
        if (current < vegetables.length) {
            vegetables[current] = vegetable;
            current++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < current; i++) {
            vegetables[i] = vegetables[i + 1];
        }
        current--;
    }
}
