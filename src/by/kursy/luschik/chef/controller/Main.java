package by.kursy.luschik.chef.controller;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.*;
import by.kursy.luschik.chef.model.util.Serializer;

public class Main {
    //    public static void main(String[] args) {
//        Tomato tomato= new Tomato("Tomato", 140, 0.6, 30, Color.IMPERIAL, 3);
//        tomato.setColor(Color.RED);
//        System.out.println(tomato);
//
//        Vegetable[] vegetables = {
////                new Tomato("Tomato", 140, 0.6, 30, Color.IMPERIAL, 3),
//                new Vegetable("Tomato", 140, 0.6, 30),
//                new Vegetable("Tomato", 140, 0.6, 30)};
//
//        Salad salad = new Salad(vegetables);
//        System.out.println(salad);
//    }
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.add(new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN));
        salad.add(new Tomato("Early Girl", 136, 0.6, 29, Color.IMPERIAL, 5));
        salad.add(new Tomato("Early Girl", 140, 0.6, 30, Color.IMPERIAL, 6));
        salad.add(new Cucumber("Tanja", 100, 0.5, 25, PeelPattern.RUSSIAN));
        salad.add(new Cucumber("Spacemaster", 85, 0.55, 28, PeelPattern.GERMAN));

        Serializer serializer = new Serializer();

        serializer.serialize(salad);
        System.out.println(serializer.deserialize());
    }
}
