package by.kursy.luschik.chef.controller;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.Salad;
import by.kursy.luschik.chef.model.entity.*;
import by.kursy.luschik.chef.model.logic.TheStrategyPattern.SorterByPriceAsc;
import by.kursy.luschik.chef.model.logic.TheStrategyPattern.SorterByPriceDsc;
import by.kursy.luschik.chef.model.logic.TheStrategyPattern.VegetableSorter;
import by.kursy.luschik.chef.model.util.Serializer;

import java.util.Random;

public class Main {
    public static final double MIN_PRICE = 1;
    public static final double MAX_PRICE = 10;

    public static void main(String[] args) {
        Vegetable[] vegetables = new Vegetable[10];
        Random random = new Random();
//        salad.add(new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN));
//        salad.add(new Tomato("Early Girl", 136, 0.6, 29, ColorTomato.IMPERIAL, 5));
//        salad.add(new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 6));
//        salad.add(new Cucumber("Tanja", 100, 0.5, 25, PeelPattern.RUSSIAN));
//        salad.add(new Cucumber("Spacemaster", 85, 0.55, 28, PeelPattern.GERMAN));

        for (int i = 0; i < 5; i++) {
            double price = (MAX_PRICE - MIN_PRICE) * random.nextDouble() + MIN_PRICE;
            vegetables[i] = new Cucumber("Tanja", 108, price, 26, PeelPattern.RUSSIAN);
        }

        for (int i = 5; i < 10; i++) {
            double price = (MAX_PRICE - MIN_PRICE) * random.nextDouble() + MIN_PRICE;
            vegetables[i] = new Tomato("Early Girl", 140, price, 30, ColorTomato.IMPERIAL, 6);
        }
        Salad salad = new Salad(vegetables);

//        VegetableSorter.bubbleSorter(salad,new SorterByPriceAsc());
//        VegetableSorter.insertionSort(salad, new SorterByPriceDsc());
        VegetableSorter.selectionSort(salad, new SorterByPriceAsc());
        System.out.println(salad);

//        System.out.println(Cook.calcTotalWeight(salad));
//        Serializer serializer = new Serializer();
//
//        serializer.serialize(salad);
//        System.out.println(serializer.deserialize());
    }
}
