package by.kursy.luschik.chef.model.logic;

import by.kursy.luschik.chef.model.entity.Vegetable;
import org.junit.Test;

import static org.junit.Assert.*;

public class CookTest {
    @Test
    public void testCalcTotalPricePositive() {
        Vegetable[] vegetables = {
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30)};

        double expected = 1.98;

        double actual = Cook.calcTotalPrice(vegetables);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalcTotalPriceWithNull() {
        double expected = 0;

        double actual = Cook.calcTotalPrice(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcTotalPriceWithEmpty() {
        Vegetable[] vegetables = {};

        double expected = 0;

        double actual = Cook.calcTotalPrice(vegetables);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcTotalWeightPositive() {
        Vegetable[] vegetables = {
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30)};

        double expected = 420;

        double actual = Cook.calcTotalWeight(vegetables);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalcTotalWeightWithNull() {
        double expected = 0;

        double actual = Cook.calcTotalWeight(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcTotalWeightWithEmpty() {
        Vegetable[] vegetables = {};

        double expected = 0;

        double actual = Cook.calcTotalWeight(vegetables);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcTotalCaloriesPositive() {
        Vegetable[] vegetables = {
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 30)};

        double expected = 90;

        double actual = Cook.calcTotalCal(vegetables);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalcTotalCaloriesWithNull() {
        double expected = 0;

        double actual = Cook.calcTotalCal(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcTotalCaloriesWithEmpty() {
        Vegetable[] vegetables = {};

        double expected = 0;

        double actual = Cook.calcTotalCal(vegetables);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testFirstFindVegetablesWithMaxCalPositive() {
        Vegetable[] vegetables = {
                new Vegetable("Tomato", 140, 0.6, 30),
                new Vegetable("Tomato", 140, 0.6, 35),
                new Vegetable("Tomato", 140, 0.6, 30)};

        Vegetable[] expected = {
                new Vegetable("Tomato", 140, 0.6, 35)};

        Vegetable[] actual = Cook.findVegetablesWithMaxCal(vegetables);
        for (int i = 0; i < expected.length; i++) {
            if (!expected[i].getName().equals(actual[i].getName()) ||
                    expected[i].getWeight() != actual[i].getWeight() ||
                    expected[i].getPrice() != actual[i].getPrice() ||
                    expected[i].getCalories() != actual[i].getCalories()) {
                fail();
            }
        }
    }

    @Test
    public void testSecondFindVegetablesWithMaxCalPositive() {
        Vegetable[] vegetables = {
                new Vegetable("Tomato", 140, 0.6, 35),
                new Vegetable("Tomato", 140, 0.6, 35),
                new Vegetable("Tomato", 140, 0.6, 30)};

        Vegetable[] expected = {
                new Vegetable("Tomato", 140, 0.6, 35),
                new Vegetable("Tomato", 140, 0.6, 35)};

        Vegetable[] actual = Cook.findVegetablesWithMaxCal(vegetables);
        for (int i = 0; i < expected.length; i++) {
            if (!expected[i].getName().equals(actual[i].getName()) ||
                    expected[i].getWeight() != actual[i].getWeight() ||
                    expected[i].getPrice() != actual[i].getPrice() ||
                    expected[i].getCalories() != actual[i].getCalories()) {
                fail();
            }
        }
    }

    @Test
    public void testFindVegetablesWithMaxCalPositiveWithNull() {
        Vegetable[] expected = {};

        Vegetable[] actual = Cook.findVegetablesWithMaxCal(null);

        assertEquals(expected.length, actual.length);
    }

    @Test
    public void testFindVegetablesWithMaxCalPositiveWithEmpty() {
        Vegetable[] expected = {};

        Vegetable[] actual = Cook.findVegetablesWithMaxCal(new Vegetable[0]);

        assertEquals(expected.length, actual.length);
    }

}
