package by.kursy.luschik.chef.model.logic.TheIteratorPattern;

import by.kursy.luschik.chef.model.entity.Vegetable;
import by.kursy.luschik.chef.usercontainers.fixedarray.FixedArray;

public class FixedArrayIterator implements Iterator {
    private FixedArray array;
    int current = 0;

    public FixedArrayIterator(FixedArray array) {
        this.array = array;
    }

    @Override
    public Vegetable next() {
        return array.get(current++);
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < array.size();
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
