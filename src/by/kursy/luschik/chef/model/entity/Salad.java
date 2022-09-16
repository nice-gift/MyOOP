package by.kursy.luschik.chef.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//public class Salad implements Iterable<Vegetable>, Serializable {
//    public static final long serialVersionUID = 1L;
//
//    private Collection<Vegetable> vegetables;
//
//    public Salad() {
//        vegetables = new ArrayList<>();
//    }
//
//    public Salad(Collection<Vegetable> vegetables) {
//        if (vegetables != null) {
//            this.vegetables = vegetables;
//        }
//    }
//
//    public int size() {
//        return vegetables.size();
//    }
//
//    public void add(Vegetable vegetable) {
//        vegetables.add(vegetable);
//    }
//
//    public void remove(Vegetable vegetable) {
//        vegetables.remove(vegetable);
//    }
//
//    public void clear() {
//        vegetables.clear();
//    }
//
////    @Override
////    public String toString() {
////        Iterator<Vegetable> iterator = vegetables.iterator();
////        StringBuilder builder = new StringBuilder();
////        while (iterator().hasNext()) {
////            builder.append(iterator.next()).append(" ");
////        }
////        return builder.toString();
////    }
//
//    @Override
//    public Iterator<Vegetable> iterator() {
//        return vegetables.iterator();
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder("List of vegetables:");
//        for (Vegetable vegetable : vegetables
//        ) {
//            builder.append("\n").append(vegetable);
//        }
//        return builder + "";
//    }
//}

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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of vegetables:");
        for (Vegetable vegetable : vegetables
        ) {
            builder.append("\n").append(vegetable);
        }
        return builder + "";
    }
}
