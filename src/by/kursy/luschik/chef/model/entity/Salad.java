package by.kursy.luschik.chef.model.entity;

public class Salad {
    private Vegetable[] vegetables;

    public void Salad() {
        vegetables = new Vegetable[0];
    }

    public void Salad(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public int size() {
        return vegetables.length;
    }

    public Vegetable get(int index) {
        if (index >= 0 && index < vegetables.length) {
            return vegetables[index];
        } else return null;
    }

    public void add(Vegetable vegetable) {
        Vegetable[] temp = new Vegetable[vegetables.length + 1];

        for (int i = 0; i < vegetables.length; i++) {
            temp[i] = vegetables[i];
        }
        temp[vegetables.length] = vegetable;
        vegetables = temp;
    }

    public void remove(Vegetable vegetable) {
        boolean flag = false;
        Vegetable[] temp = new Vegetable[vegetables.length - 1];

        for (int i = 0, j = 0; i < vegetables.length; i++) {
            if (flag || !vegetables[i].getName().equals(vegetable.getName()) ||
                    vegetables[i].getWeight() != vegetable.getWeight() ||
                    vegetables[i].getPrice() != vegetable.getPrice() ||
                    vegetables[i].getCalories() != vegetable.getCalories()) {
                temp[j] = vegetables[i];
                j++;
            } else {
                flag = true;
            }
        }
        vegetables = temp;
    }

    public void remove(int index) {
        Vegetable[] temp = new Vegetable[vegetables.length - 1];

        for (int i = 0, j = 0; i < vegetables.length; i++) {
            if (i != index) {
                temp[j] = vegetables[i];
                j++;
            }
        }
        vegetables = temp;
    }
}
