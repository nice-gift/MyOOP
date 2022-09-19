package by.kursy.luschik.chef.usercontainers;

import by.kursy.luschik.chef.model.entity.*;
import by.kursy.luschik.chef.usercontainers.singlelist.Salad3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleListTest {
    private static Salad3 salad;

    @Before
    public void init() {
        Vegetable[] vegetables = new Vegetable[10];
        vegetables[0] = new Cucumber("Tanja", 108, 0.5, 22,
                PeelPattern.RUSSIAN);

        for (int i = 1; i < 5; i++) {
            vegetables[i] = new Cucumber("Tanja", 108, 0.5, 26,
                    PeelPattern.RUSSIAN);
        }

        for (int i = 5; i < 10; i++) {
            vegetables[i] = new Tomato("Early Girl", 140, 0.6, 30,
                    ColorTomato.IMPERIAL, 6);
        }

        salad = new Salad3(vegetables);
    }

    @Test
    public void testSize() {
        int expected = 10;

        int actual = salad.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testSizeWithEmpty() {
        int expected = 0;

        Salad3 salad = new Salad3();
        int actual = salad.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testSizeWithNull() {
        int expected = 0;

        Salad3 salad = new Salad3(null);
        int actual = salad.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetByPositive() {
        int index = 0;
        Vegetable expected = new Cucumber("Tanja", 108, 0.5, 22,
                PeelPattern.RUSSIAN);

        Vegetable actual = salad.get(index);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetIndexOutOfBound() {
        int index = -1;

        Vegetable actual = salad.get(index);

        assertNull(actual);
    }

    @Test
    public void testSet() {
        int index = 4;
        Vegetable vegetable = new Cucumber("Tanja", 60, 0.5, 22,
                PeelPattern.RUSSIAN);
        salad.set(index, vegetable);

        Vegetable expected = vegetable;

        Vegetable actual = salad.get(index);
    }

    @Test
    public void testAdd() {
        Vegetable vegetable = new Cucumber("Tanja", 60, 0.5, 22,
                PeelPattern.RUSSIAN);

        salad.add(vegetable);

        Vegetable expected = salad.get(10);

        Vegetable actual = vegetable;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByIndex() {
        int index = 4;

        Vegetable[] vegetables = new Vegetable[9];
        vegetables[0] = new Cucumber("Tanja", 108, 0.5, 22,
                PeelPattern.RUSSIAN);

        for (int i = 1; i < 4; i++) {
            vegetables[i] = new Cucumber("Tanja", 108, 0.5, 26,
                    PeelPattern.RUSSIAN);
        }

        for (int i = 4; i < 9; i++) {
            vegetables[i] = new Tomato("Early Girl", 140, 0.6, 30,
                    ColorTomato.IMPERIAL, 6);
        }

        Salad3 expected = new Salad3(vegetables);


        salad.remove(index);
        Salad3 actual = salad;

        for (int i = 0; i < actual.size(); i++) {
            if (!actual.get(i).getName().equals(expected.get(i).getName()) ||
                    actual.get(i).getWeight() != expected.get(i).getWeight() ||
                    actual.get(i).getPrice() != expected.get(i).getPrice() ||
                    actual.get(i).getCalories() != expected.get(i).getCalories()) {
                fail();
            }
        }
    }

    @Test
    public void testRemoveFirstElement() {
        int index = 0;

        Vegetable[] vegetables = new Vegetable[9];
        for (int i = 0; i < 4; i++) {
            vegetables[i] = new Cucumber("Tanja", 108, 0.5, 26,
                    PeelPattern.RUSSIAN);
        }

        for (int i = 4; i < 9; i++) {
            vegetables[i] = new Tomato("Early Girl", 140, 0.6, 30,
                    ColorTomato.IMPERIAL, 6);
        }

        Salad3 expected = new Salad3(vegetables);


        salad.remove(index);
        Salad3 actual = salad;

        for (int i = 0; i < actual.size(); i++) {
            if (!actual.get(i).getName().equals(expected.get(i).getName()) ||
                    actual.get(i).getWeight() != expected.get(i).getWeight() ||
                    actual.get(i).getPrice() != expected.get(i).getPrice() ||
                    actual.get(i).getCalories() != expected.get(i).getCalories()) {
                fail();
            }
        }
    }

    @Test
    public void testRemoveByIndexNegative() {
        int index = -11;

        Salad3 expected = salad;

        salad.remove(index);
        Salad3 actual = salad;

        for (int i = 0; i < actual.size(); i++) {
            if (!actual.get(i).getName().equals(expected.get(i).getName()) ||
                    actual.get(i).getWeight() != expected.get(i).getWeight() ||
                    actual.get(i).getPrice() != expected.get(i).getPrice() ||
                    actual.get(i).getCalories() != expected.get(i).getCalories()) {
                fail();
            }
        }
    }

    @Test(timeout = 10)
    public void testRemoveByIndexNegativeTimeout() {
        int index = -11;

        salad.remove(index);
    }
}