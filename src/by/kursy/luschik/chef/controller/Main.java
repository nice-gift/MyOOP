package by.kursy.luschik.chef.controller;

//  Шеф-повар (Chef). Необходимо приготовить овощной салат и определить вес
//  салата и его калорийность, а также найти самый калорийных овощ в салате.

import by.kursy.luschik.chef.model.entity.Salad;
import by.kursy.luschik.chef.model.entity.Vegetable;

public class Main {
    public static void main(String[] args) {
        Vegetable[] vegetables = {
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30)};

        Salad salad = new Salad(vegetables);
        System.out.println(salad);
    }
}
