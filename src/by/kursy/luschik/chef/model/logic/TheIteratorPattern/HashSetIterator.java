package by.kursy.luschik.chef.model.logic.TheIteratorPattern;

import by.kursy.luschik.chef.model.entity.Vegetable;

import java.util.HashSet;

public class HashSetIterator implements Iterator {
    private HashSet set;
    int current = 0;


    public HashSetIterator(HashSet set) {
        this.set = set;
    }

    @Override
    public Vegetable next() {
        Vegetable vegetable = null;
        int iter = 0;
        java.util.Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iter == current) {
                vegetable = (Vegetable) iterator.next();
                break;
            }
            iter++;
        }
        current++;
        return vegetable;
    }

    @Override
    public boolean hasNext() {
        boolean flag = (current < set.size());
        if (!flag) {
            current = 0;
        }
        return flag;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
