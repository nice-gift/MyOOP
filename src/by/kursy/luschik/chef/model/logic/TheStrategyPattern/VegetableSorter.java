package by.kursy.luschik.chef.model.logic.TheStrategyPattern;

import by.kursy.luschik.chef.model.entity.Salad;
import by.kursy.luschik.chef.model.entity.Vegetable;

public class VegetableSorter {
    public static void bubbleSorter(Salad salad, Comparable comparable) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < salad.size() - 1 - i; j++) {
                if (comparable.compare(salad.get(j), salad.get(j + 1))) {
                    Vegetable t = salad.get(j);
                    salad.set(j, salad.get(j + 1));
                    salad.set(j + 1, t);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void insertionSort(Salad salad, Comparable comparable) {
        if (salad == null) {
            return;
        }

        for (int i = 1; i < salad.size(); i++) {
            Vegetable element = salad.get(i);
            int j = i - 1;
            while (j >= 0 && comparable.compare(salad.get(j), element)) {
                salad.set(j + 1, salad.get(j));
                j--;
            }
            salad.set(j + 1, element);
        }
    }

    public static void selectionSort(Salad salad, Comparable comparable) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < salad.size(); j++) {
                if (comparable.compare(salad.get(minElement), salad.get(j))) {
                    minElement = j;
                }
            }
            Vegetable t = salad.get(i);
            salad.set(i, salad.get(minElement));
            salad.set(minElement, t);
        }

    }
}
