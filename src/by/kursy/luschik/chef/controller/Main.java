package by.kursy.luschik.chef.controller;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.Color;
import by.kursy.luschik.chef.model.entity.Salad;
import by.kursy.luschik.chef.model.entity.Tomato;
import by.kursy.luschik.chef.model.entity.Vegetable;

public class Main {
    public static void main(String[] args) {
        Tomato tomato= new Tomato("Tomato", 140, 0.6, 30, Color.IMPERIAL, 3);
        tomato.setColor(Color.RED);
        System.out.println(tomato);

        Vegetable[] vegetables = {
//                new Tomato("Tomato", 140, 0.6, 30, Color.IMPERIAL, 3),
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30)};

        Salad salad = new Salad(vegetables);
        System.out.println(salad);
    }


}
