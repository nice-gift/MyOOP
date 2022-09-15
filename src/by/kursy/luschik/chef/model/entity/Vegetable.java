package by.kursy.luschik.chef.model.entity;

import by.kursy.luschik.chef.model.exception.VegetableCaloriesWrongException;
import by.kursy.luschik.chef.model.exception.VegetablePriceWrongException;
import by.kursy.luschik.chef.model.exception.VegetableWeightWrongException;

public class Vegetable {
    private String name;
    private double weight;
    private double price;
    private int calories;

    public Vegetable() {
        name = "no name";
        weight = 0.0;
        price = 0.0;
        calories = 0;
    }

    public Vegetable(String name, double weight, double price, int calories) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        if (calories >= 0) {
            this.calories = calories;
        }
    }

    public Vegetable(Vegetable vegetable) {
        this(vegetable.name, vegetable.weight, vegetable.price,
                vegetable.calories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws VegetableWeightWrongException {
        if (weight > 0) {
            this.weight = weight;
        } else throw new VegetableWeightWrongException();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws VegetablePriceWrongException {
        if (price > 0) {
            this.price = price;
        } else throw new VegetablePriceWrongException();
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) throws VegetableCaloriesWrongException {
        if (calories > 0) {
            this.calories = calories;
        } else throw new VegetableCaloriesWrongException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vegetable vegetable = (Vegetable) o;

        if (!name.equals(vegetable.name)) return false;
        if (weight != vegetable.weight) return false;
        if (price != vegetable.price) return false;
        return calories == vegetable.calories;
    }

    @Override
    public int hashCode() {
        int code = 31;

        int hash = name.hashCode();
        hash = hash * code + Double.hashCode(weight);
        hash = hash * code + Double.hashCode(price);
        hash = hash * code + calories;

        return hash;
    }

    @Override
    public String toString() {
        return name + ": weight = " + weight + ", price = " + price +
                ", calories = " + calories;
    }
}
