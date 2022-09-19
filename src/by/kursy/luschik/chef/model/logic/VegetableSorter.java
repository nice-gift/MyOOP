package by.kursy.luschik.chef.model.logic;

import by.kursy.luschik.chef.model.entity.Salad;
import by.kursy.luschik.chef.model.entity.Vegetable;

public class VegetableSorter {
    public static void bubbleSorterByPriceAsc(Salad salad) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            for (int j = 0; j < salad.size() - 1 - i; j++) {
                if (salad.get(j).getPrice() > salad.get(j + 1).getPrice()) {
                    Vegetable t = salad.get(j);
                    salad.set(j, salad.get(j + 1));
                    salad.set(j + 1, t);
                }
            }
        }
    }

    public static void bubbleSorterByPriceDsc(Salad salad) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            for (int j = 0; j < salad.size() - 1 - i; j++) {
                if (salad.get(j).getPrice() < salad.get(j + 1).getPrice()) {
                    Vegetable t = salad.get(j);
                    salad.set(j, salad.get(j + 1));
                    salad.set(j + 1, t);
                }
            }
        }
    }

    public static void bubbleSorterByWeightAsc(Salad salad) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            for (int j = 0; j < salad.size() - 1 - i; j++) {
                if (salad.get(j).getWeight() > salad.get(j + 1).getWeight()) {
                    Vegetable t = salad.get(j);
                    salad.set(j, salad.get(j + 1));
                    salad.set(j + 1, t);
                }
            }
        }
    }

    public static void bubbleSorterByWeightDsc(Salad salad) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            for (int j = 0; j < salad.size() - 1 - i; j++) {
                if (salad.get(j).getWeight() < salad.get(j + 1).getWeight()) {
                    Vegetable t = salad.get(j);
                    salad.set(j, salad.get(j + 1));
                    salad.set(j + 1, t);
                }
            }
        }
    }

    public static void insertedSorterByPriceAsc(Salad salad) {
        if (salad == null) {
            return;
        }

        for (int i = 0; i < salad.size() - 1; i++) {
            for (int j = 1; j < salad.size() - 1 - i; j++) {
                if (salad.get(j).getPrice() > salad.get(j + 1).getPrice()) {
                    Vegetable t = salad.get(j);
                    salad.set(j, salad.get(j + 1));
                    salad.set(j + 1, t);
                }
            }
        }

    }
}