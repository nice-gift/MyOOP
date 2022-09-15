package by.kursy.luschik.chef.model.entity;

public class Pepper extends Vegetable {
    ColorPepper colorPepper;

    public Pepper() {
        colorPepper = ColorPepper.RED;
    }

    public Pepper(String name, double weight, double price, int calories,
                  ColorPepper colorPepper) {
        super(name, weight, price, calories);
        this.colorPepper = colorPepper;
    }

    public Pepper(Pepper pepper) {
        this(pepper.getName(), pepper.getWeight(), pepper.getPrice(),
                pepper.getCalories(), pepper.colorPepper);
    }

    public ColorPepper getColorPepper() {
        return colorPepper;
    }

    public void setColorPepper(ColorPepper colorPepper) {
        this.colorPepper = colorPepper;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Pepper pepper = (Pepper) o;
        return colorPepper == pepper.colorPepper;
    }

    @Override
    public int hashCode() {
        int code = 31;
        int hash = code * super.hashCode() + (colorPepper != null ?
                colorPepper.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + ", color = " + colorPepper;
    }
}
