package by.kursy.luschik.chef.model.logic;

import by.kursy.luschik.chef.model.entity.Vegetable;

public class Cook {
    public static final double LABOR_PERCENT = 0.1;

    public static double calcTotalPrice(Vegetable[] vegetables) {
        if (vegetables == null) {
            return 0;
        }

        double totalPrice = 0;

        for (Vegetable vegetable : vegetables
        ) {
            totalPrice += vegetable.getPrice();
        }

        return totalPrice + totalPrice * LABOR_PERCENT;
    }

    public static double calcTotalWeight(Vegetable[] vegetables) {
        if (vegetables == null) {
            return 0;
        }

        double totalWeight = 0;

        for (Vegetable vegetable : vegetables
        ) {
            totalWeight += vegetable.getWeight();
        }

        return totalWeight;
    }

    public static double calcTotalCal(Vegetable[] vegetables) {
        if (vegetables == null) {
            return 0;
        }

        double totalCalories = 0;

        for (Vegetable vegetable : vegetables
        ) {
            totalCalories += vegetable.getCalories();
        }

        return totalCalories;
    }

    private static int getMaxCal(Vegetable[] vegetables) {
        int maxCal = vegetables[0].getCalories();
        for (Vegetable vegetable : vegetables
        ) {
            if (vegetable.getCalories() > maxCal) {
                maxCal = vegetable.getCalories();
            }
        }
        return maxCal;
    }

    private static int countVegetablesWithMaxCal(Vegetable[] vegetables, int maxCal) {
        int count = 0;

        for (Vegetable vegetable : vegetables
        ) {
            if (vegetable.getCalories() == maxCal) {
                count++;
            }
        }
        return count;
    }

    public static Vegetable[] findVegetablesWithMaxCal(Vegetable[] vegetables) {
        if (vegetables == null || vegetables.length == 0) {
            return new Vegetable[0];
        }

        int maxCal = getMaxCal(vegetables);
        int count = countVegetablesWithMaxCal(vegetables, maxCal);

        Vegetable[] result = new Vegetable[count];

        int i = 0;
        for (Vegetable vegetable : vegetables
        ) {
            if (vegetable.getCalories() == maxCal) {
                result[i] = vegetable;
                i++;
            }
        }

        return result;
    }
}
