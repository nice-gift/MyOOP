package by.kursy.luschik.chef.usercontainers.fixedarray;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.*;

public class Main2 {
    public static void main(String[] args) {
        Vegetable[] vegetables = new Vegetable[10];

        for (int i = 0; i < 5; i++) {
            vegetables[i] = new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN);
        }

        for (int i = 5; i < 10; i++) {
            vegetables[i] = new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 6);
        }

        Salad2 salad = new Salad2(vegetables);

        System.out.println(salad);
        System.out.println(Cook2.calcTotalWeight(salad));
//        Serializer serializer = new Serializer();
//
//        serializer.serialize(salad);
//        System.out.println(serializer.deserialize());
    }
}
