package by.kursy.luschik.chef.model.container;

public abstract class AbstractContainer implements Container {
    public boolean isEmpty() {
        return size() == 0;
    }
}
