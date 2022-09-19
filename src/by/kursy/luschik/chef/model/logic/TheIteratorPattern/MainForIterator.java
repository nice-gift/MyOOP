package by.kursy.luschik.chef.model.logic.TheIteratorPattern;

import by.kursy.luschik.chef.model.entity.*;
import by.kursy.luschik.chef.usercontainers.fixedarray.FixedArray;

import java.util.HashSet;

public class MainForIterator {
    public static void main(String[] args) {
        HashSet vegetables = new HashSet();

        vegetables.add(new Cucumber("Tanja", 108, 0.5, 26, PeelPattern.RUSSIAN));
        vegetables.add(new Tomato("Early Girl", 136, 0.6, 29, ColorTomato.IMPERIAL, 5));
        vegetables.add(new Tomato("Early Girl", 140, 0.6, 30, ColorTomato.IMPERIAL, 6));
        vegetables.add(new Cucumber("Tanja", 100, 0.5, 25, PeelPattern.RUSSIAN));
        vegetables.add(new Cucumber("Spacemaster", 85, 0.55, 28, PeelPattern.GERMAN));



        HashSetIterator iterator = new HashSetIterator(vegetables);
        view(iterator);
        view(iterator);
    }

    public static void view(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
