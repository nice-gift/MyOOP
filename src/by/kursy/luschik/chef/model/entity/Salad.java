package by.kursy.luschik.chef.model.entity;

import by.kursy.luschik.chef.model.container.Container;
import by.kursy.luschik.chef.usercontainers.fixedarray.FixedArray;

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
    private Container vegetables;

    public Salad() {
        vegetables = new FixedArray();
    }

    public Salad(Vegetable[] vegetables) {
        this();
        if (vegetables != null) {
            for (int i = 0; i < vegetables.length; i++) {
                this.vegetables.add(vegetables[i]);
            }
        }
    }

    public Salad(Container vegetables) {
        this.vegetables = vegetables;
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
        for (int i = 0; i < vegetables.size(); i++) {
            builder.append("\n").append(vegetables.get(i));
        }
        return builder + "";
    }
}
