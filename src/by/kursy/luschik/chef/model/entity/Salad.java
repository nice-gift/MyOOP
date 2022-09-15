package by.kursy.luschik.chef.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Salad implements Iterable<Vegetable>, Serializable {
    public static final long serialVersionUID = 1L;

    private Collection<Vegetable> vegetables;

    public Salad() {
        vegetables = new ArrayList<>();
    }

    public Salad(Collection<Vegetable> vegetables) {
        if (vegetables != null) {
            this.vegetables = vegetables;
        }
    }

    public int size() {
        return vegetables.size();
    }

    public void add(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public void remove(Vegetable vegetable) {
        vegetables.remove(vegetable);
    }

    public void clear() {
        vegetables.clear();
    }

//    @Override
//    public String toString() {
//        Iterator<Vegetable> iterator = vegetables.iterator();
//        StringBuilder builder = new StringBuilder();
//        while (iterator().hasNext()) {
//            builder.append(iterator.next()).append(" ");
//        }
//        return builder.toString();
//    }

    @Override
    public Iterator<Vegetable> iterator() {
        return vegetables.iterator();
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
