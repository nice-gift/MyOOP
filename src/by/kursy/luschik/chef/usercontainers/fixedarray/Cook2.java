package by.kursy.luschik.chef.usercontainers.fixedarray;

import by.kursy.luschik.chef.model.entity.Vegetable;

public class Cook2 {
    public static final double LABOR_PERCENT = 0.1;

    public static double calcTotalPrice(Salad2 salad) {
        if (salad == null) {
            return 0;
        }

        double totalPrice = 0;

        for (int i = 0; i < salad.size(); i++) {
            totalPrice += salad.get(i).getPrice();
        }

        return totalPrice + totalPrice * LABOR_PERCENT;
    }

    public static double calcTotalWeight(Salad2 salad) {
        if (salad == null) {
            return 0;
        }

        double totalWeight = 0;

        for (int i = 0; i < salad.size(); i++) {
            totalWeight += salad.get(i).getWeight();
        }

        return totalWeight;
    }

    public static double calcTotalCal(Salad2 salad) {
        if (salad == null) {
            return 0;
        }

        double totalCalories = 0;

        for (int i = 0; i < salad.size(); i++) {
            totalCalories += salad.get(i).getCalories();
        }

        return totalCalories;
    }

    private static int getMaxCal(Salad2 salad) {
        int maxCal = 0;

        for (int i = 0; i < salad.size(); i++) {
            if (salad.get(i).getCalories() > maxCal) {
                maxCal = salad.get(i).getCalories();
            }
        }
        return maxCal;
    }

    private static int countVegetablesWithMaxCal(Salad2 salad, int maxCal) {
        int count = 0;

        for (int i = 0; i < salad.size(); i++) {
            if (salad.get(i).getCalories() == maxCal) {
                count++;
            }
        }
        return count;
    }

    public static Vegetable[] findVegetablesWithMaxCal(Salad2 salad) {
        if (salad == null || salad.size() == 0) {
            return new Vegetable[0];
        }

        int maxCal = getMaxCal(salad);
        int count = countVegetablesWithMaxCal(salad, maxCal);

        Vegetable[] result = new Vegetable[count];
        int j = 0;

        for (int i = 0; i < salad.size(); i++) {
            if (salad.get(i).getCalories() == maxCal) {
                result[j] = salad.get(i);
                j++;
            }
        }

        return result;
    }
}
