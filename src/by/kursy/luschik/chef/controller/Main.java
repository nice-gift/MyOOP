package by.kursy.luschik.chef.controller;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.*;
import by.kursy.luschik.chef.model.logic.Cook;
import by.kursy.luschik.chef.model.util.Serializer;

public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.add(new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN));
        salad.add(new Tomato("Early Girl", 136, 0.6, 29, ColorTomato.IMPERIAL, 5));
        salad.add(new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 6));
        salad.add(new Cucumber("Tanja", 100, 0.5, 25, PeelPattern.RUSSIAN));
        salad.add(new Cucumber("Spacemaster", 85, 0.55, 28, PeelPattern.GERMAN));

        Vegetable[] vegetables = new Vegetable[10];

        for (int i = 0; i < 5; i++) {
            vegetables[i] = new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN);
        }

        for (int i = 0; i < 5; i++) {
            vegetables[i] = new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 6);
        }

        System.out.println(salad);
        System.out.println(Cook.calcTotalWeight(salad));
//        Serializer serializer = new Serializer();
//
//        serializer.serialize(salad);
//        System.out.println(serializer.deserialize());
    }
}
