package by.kursy.luschik.chef.model.entity;

import java.util.ArrayList;

public class Salad {
    private ArrayList<Vegetable> vegetables;

    public Salad() {
        vegetables = new ArrayList<>();
    }

    public Salad(Vegetable[] vegetables) {
        if (vegetables != null) {
            this.vegetables = new ArrayList<>();
            for (Vegetable vegetable : vegetables
            ) {
                this.vegetables.add(vegetable);
            }
        } else vegetables = new Vegetable[0];
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

    public void remove(Vegetable vegetable) {
        boolean flag = false;
        ArrayList<Vegetable> temp = new ArrayList<>();

        for (int i = 0; i < vegetables.size(); i++) {
            if (flag || !vegetables.get(i).getName().equals(vegetable.getName()) ||
                    vegetables.get(i).getWeight() != vegetable.getWeight() ||
                    vegetables.get(i).getPrice() != vegetable.getPrice() ||
                    vegetables.get(i).getCalories() != vegetable.getCalories()) {
                temp.add(vegetables.get(i));
            } else {
                flag = true;
            }
        }
        vegetables = temp;
    }

    public void remove(int index) {
        ArrayList<Vegetable> temp = new ArrayList<>();

        for (int i = 0; i < vegetables.size(); i++) {
            if (i != index) {
                temp.add(vegetables.get(i));
            }
        }
        vegetables = temp;
    }
}
