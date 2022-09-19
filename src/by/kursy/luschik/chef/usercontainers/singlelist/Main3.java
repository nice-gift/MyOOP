package by.kursy.luschik.chef.usercontainers.singlelist;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.*;

public class Main3 {
    public static void main(String[] args) {
        Vegetable[] vegetables = new Vegetable[10];
        vegetables[0] = new Cucumber("Tanja", 108, 0.5, 22, PeelPattern.RUSSIAN);

        for (int i = 1; i < 5; i++) {
            vegetables[i] = new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN);
        }

        for (int i = 5; i < 10; i++) {
            vegetables[i] = new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 6);
        }

        Salad3 salad = new Salad3(vegetables);

        salad.set(1,new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 5));
        salad.set(4,new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 5));
        System.out.println(salad);
//        System.out.println(salad);
//        salad.add(new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 8));
//        System.out.println(salad);
//        System.out.println(salad.get(4));
//        System.out.println(salad.get(5));
//        salad.remove(0);
//        System.out.println(salad);

//        SingleList salad=new SingleList();
//        salad.add(new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 8));
//        System.out.println(salad.get(0));
    }
}
