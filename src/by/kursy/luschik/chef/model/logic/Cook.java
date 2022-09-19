//package by.kursy.luschik.chef.model.logic;
//
//import by.kursy.luschik.chef.model.entity.Salad;
//import by.kursy.luschik.chef.model.entity.Vegetable;
//
//public class Cook {
//    public static final double LABOR_PERCENT = 0.1;
//
//    public static double calcTotalPrice(Salad salad) {
//        if (salad == null) {
//            return 0;
//        }
//
//        double totalPrice = 0;
//
//        for (Vegetable vegetable : salad) {
//            totalPrice += vegetable.getPrice();
//        }
//
//        return totalPrice + totalPrice * LABOR_PERCENT;
//    }
//
//    public static double calcTotalWeight(Salad salad) {
//        if (salad == null) {
//            return 0;
//        }
//
//        double totalWeight = 0;
//
//        for (Vegetable vegetable : salad) {
//            totalWeight += vegetable.getWeight();
//        }
//
//        return totalWeight;
//    }
//
//    public static double calcTotalCal(Salad salad) {
//        if (salad == null) {
//            return 0;
//        }
//
//        double totalCalories = 0;
//
//        for (Vegetable vegetable : salad) {
//            totalCalories += vegetable.getCalories();
//        }
//
//        return totalCalories;
//    }
//
//    private static int getMaxCal(Salad salad) {
//        int maxCal = 0;
//
//        for (Vegetable vegetable : salad) {
//            if (vegetable.getCalories() > maxCal) {
//                maxCal = vegetable.getCalories();
//            }
//        }
//        return maxCal;
//    }
//
//    private static int countVegetablesWithMaxCal(Salad salad, int maxCal) {
//        int count = 0;
//
//        for (Vegetable vegetable : salad) {
//            if (vegetable.getCalories() == maxCal) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static Vegetable[] findVegetablesWithMaxCal(Salad salad) {
//        if (salad == null || salad.size() == 0) {
//            return new Vegetable[0];
//        }
//
//        int maxCal = getMaxCal(salad);
//        int count = countVegetablesWithMaxCal(salad, maxCal);
//
//        Vegetable[] result = new Vegetable[count];
//        int j = 0;
//
//        for (Vegetable vegetable : salad) {
//            if (vegetable.getCalories() == maxCal) {
//                result[j] = vegetable;
//                j++;
//            }
//        }
//
//        return result;
//    }
//}
