package by.kursy.luschik.chef.usercontainers.fixedarray;

import by.kursy.luschik.chef.model.entity.Vegetable;

public class Salad2 {
    private FixedArray vegetables;

    public Salad2() {
        vegetables = new FixedArray();
    }

    public Salad2(Vegetable[] vegetables) {
        if (vegetables != null) {
            this.vegetables = new FixedArray(vegetables);
        } else {
            this.vegetables = new FixedArray();
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
