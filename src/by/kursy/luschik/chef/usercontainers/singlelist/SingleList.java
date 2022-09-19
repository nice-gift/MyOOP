package by.kursy.luschik.chef.usercontainers.singlelist;

import by.kursy.luschik.chef.model.container.AbstractContainer;
import by.kursy.luschik.chef.model.container.Container;
import by.kursy.luschik.chef.model.entity.Vegetable;

class VegetableNode {
    public Vegetable value;
    public VegetableNode next;
}

public class SingleList extends AbstractContainer {
    private VegetableNode first;

    public SingleList() {
        first = new VegetableNode();
    }

    public SingleList(Vegetable[] vegetables) {
        first = new VegetableNode();
        VegetableNode temp = first;

        for (int i = 0; i < vegetables.length - 1; i++) {
            temp.value = vegetables[i];
            temp.next = new VegetableNode();
            temp = temp.next;
        }
        temp.value = vegetables[vegetables.length - 1];
    }

    public int size() {
        if (first.value == null) {
            return 0;
        }

        int count = 0;
        VegetableNode temp = first;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    @Override
    public void set(int index, Vegetable vegetable) {
        int count = 0;
        VegetableNode temp = first;

        while (count != index) {
            temp = temp.next;
            count++;
        }
        temp.value = vegetable;
    }

    public Vegetable get(int index) {
        int count = 0;
        VegetableNode temp = first;

        while (count != index) {
            temp = temp.next;
            count++;
        }
        return temp.value;
    }

    public void add(Vegetable vegetable) {
        if (first.value == null) {
            first.value = vegetable;
            return;
        }

        VegetableNode temp = first;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new VegetableNode();
        temp = temp.next;
        temp.value = vegetable;
    }

    public void remove(int index) {
        if (index == 0) {
            first = first.next;
            return;
        }

        int count = 0;
        VegetableNode temp = first;

        while (temp.next != null) {
            temp = temp.next;
            count++;

            if (count == index - 1) {
                VegetableNode previous = temp;
                previous = previous.next;
                temp.next = previous.next;
            }
        }
    }
}