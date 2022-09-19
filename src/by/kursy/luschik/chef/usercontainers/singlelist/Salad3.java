package by.kursy.luschik.chef.usercontainers.singlelist;

import by.kursy.luschik.chef.model.entity.Vegetable;

public class Salad3 {
    private SingleList vegetables;

    public Salad3() {
        vegetables = new SingleList();
    }

    public Salad3(Vegetable[] vegetables) {
        if (vegetables != null) {
            this.vegetables = new SingleList(vegetables);
        } else {
            this.vegetables = new SingleList();
        }
    }

    public int size() {
        return vegetables.size();
    }

    public Vegetable get(int index) {
        if (index >= 0 && index < vegetables.size()) {
            return vegetables.get(index);
        } else return null;
    }

    public void set(int index, Vegetable vegetable) {
        vegetables.set(index, vegetable);
    }

    public void add(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public void remove(int index) {
        vegetables.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of vegetables:");
        for (int i = 0; i < vegetables.size() ; i++) {
            builder.append("\n").append(vegetables.get(i));
        }
        return builder + "";
    }
}
