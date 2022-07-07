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

    public static double calcTotalCalories(Vegetable[] vegetables) {
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
}
