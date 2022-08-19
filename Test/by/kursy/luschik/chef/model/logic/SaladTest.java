package by.kursy.luschik.chef.model.logic;

import by.kursy.luschik.chef.model.entity.Salad;
import org.junit.Assert;
import org.junit.Test;

public class SaladTest {

    @Test
    public void testConstructorWithNull() {
        Salad salad = new Salad(null);

        int expected = 0;

        int actual = salad.size();

        Assert.assertEquals(expected, actual);
    }
}
