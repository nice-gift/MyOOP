package by.kursy.luschik.chef.model.logic;

import by.kursy.luschik.chef.model.entity.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.fail;

public class VegetableSorterTest {
    private static Salad salad;
    public static final double MIN_PRICE = 1;
    public static final double MAX_PRICE = 10;

    @BeforeClass
    public static void init() {
        Vegetable[] vegetables = new Vegetable[4];
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            double price = (MAX_PRICE - MIN_PRICE) * random.nextDouble()
                    + MIN_PRICE;
            vegetables[i] = new Cucumber("Tanja", 108, price, 26,
                    PeelPattern.RUSSIAN);
        }

        for (int i = 2; i < 4; i++) {
            double price = (MAX_PRICE - MIN_PRICE) * random.nextDouble() + MIN_PRICE;
            vegetables[i] = new Tomato("Early Girl", 140, price, 30,
                    ColorTomato.IMPERIAL, 6);
        }
        salad = new Salad(vegetables);
    }

    @Test
    public void testBubbleSorterByPriceAsc() {
        VegetableSorter.bubbleSorterByPriceAsc(salad);
        for (int i = 0; i < salad.size() - 1; i++) {
            if (salad.get(i).getPrice() > salad.get(i + 1).getPrice()) {
                fail();
            }
        }
    }

    @Test
    public void testBubbleSorterByPriceAscWithNull() {
        VegetableSorter.bubbleSorterByPriceAsc(null);

    }

    @Test
    public void testBubbleSorterByPriceDsc() {
        VegetableSorter.bubbleSorterByPriceDsc(salad);
        for (int i = 0; i < salad.size() - 1; i++) {
            if (salad.get(i).getPrice() < salad.get(i + 1).getPrice()) {
                fail();
            }
        }
    }

    @Test
    public void testBubbleSorterByPriceDscWithNull() {
        VegetableSorter.bubbleSorterByPriceDsc(null);

    }

    @Test
    public void testBubbleSorterByWeightAsc() {
        VegetableSorter.bubbleSorterByWeightAsc(salad);
        for (int i = 0; i < salad.size() - 1; i++) {
            if (salad.get(i).getWeight() > salad.get(i + 1).getWeight()) {
                fail();
            }
        }
    }

    @Test
    public void testBubbleSorterByWeightAscWithNull() {
        VegetableSorter.bubbleSorterByWeightAsc(null);

    }

    @Test
    public void testBubbleSorterByWeightDsc() {
        VegetableSorter.bubbleSorterByWeightDsc(salad);
        for (int i = 0; i < salad.size() - 1; i++) {
            if (salad.get(i).getWeight() < salad.get(i + 1).getWeight()) {
                fail();
            }
        }
    }

    @Test
    public void testBubbleSorterByWeightDscWithNull() {
        VegetableSorter.bubbleSorterByWeightDsc(null);

    }
}
