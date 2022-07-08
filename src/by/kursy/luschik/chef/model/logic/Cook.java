package by.kursy.luschik.chef.model.logic;

import by.kursy.luschik.chef.model.entity.Salad;
import by.kursy.luschik.chef.model.entity.Vegetable;

public class Cook {
    public static final double LABOR_PERCENT = 0.1;

    public static double calcTotalPrice(Salad salad) {
        if (salad == null) {
            return 0;
        }

        double totalPrice = 0;

        for (int i = 0; i < salad.size(); i++) {
            totalPrice += salad.get(i).getPrice();
        }

        return totalPrice + totalPrice * LABOR_PERCENT;
    }

    public static double calcTotalWeight(Salad salad) {
        if (salad == null) {
            return 0;
        }

        double totalWeight = 0;

        for (int i = 0; i < salad.size(); i++) {
            totalWeight += salad.get(i).getWeight();
        }

        return totalWeight;
    }

    public static double calcTotalCal(Salad salad) {
        if (salad == null) {
            return 0;
        }

        double totalCalories = 0;

        for (int i = 0; i < salad.size(); i++) {
            totalCalories += salad.get(i).getCalories();
        }

        return totalCalories;
    }

    private static int getMaxCal(Salad salad) {
        int maxCal = salad.get(0).getCalories();

        for (int i = 0; i < salad.size(); i++) {
            if (salad.get(i).getCalories() > maxCal) {
                maxCal = salad.get(i).getCalories();
            }
        }
        return maxCal;
    }

    private static int countVegetablesWithMaxCal(Salad salad, int maxCal) {
        int count = 0;

        for (int i = 0; i < salad.size(); i++) {
            if (salad.get(i).getCalories() == maxCal) {
                count++;
            }
        }
        return count;
    }

    public static Vegetable[] findVegetablesWithMaxCal(Salad salad) {
        if (salad == null || salad.size() == 0) {
            return new Vegetable[0];
        }

        int maxCal = getMaxCal(salad);
        int count = countVegetablesWithMaxCal(salad, maxCal);

        Vegetable[] result = new Vegetable[count];

        for (int i = 0, j=0; i < salad.size(); i++) {
            if (salad.get(i).getCalories() == maxCal) {
                result[j] = salad.get(i);
                j++;
            }
        }

        return result;
    }
}
