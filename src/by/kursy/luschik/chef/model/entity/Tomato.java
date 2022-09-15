package by.kursy.luschik.chef.model.entity;

public class Tomato extends Vegetable {
    private ColorTomato colorTomato;
    private int dia;

    public Tomato() {
        colorTomato = ColorTomato.FERRARI;
        dia = 0;
    }

    public Tomato(String name, double weight, double price, int calories, ColorTomato colorTomato, int dia) {
        super(name, weight, price, calories);
        this.colorTomato = colorTomato;
        this.dia = dia;
    }

    public Tomato(Tomato tomato) {
        this(tomato.getName(), tomato.getWeight(), tomato.getPrice(),
                tomato.getCalories(), tomato.colorTomato, tomato.dia);
    }

    public ColorTomato getColor() {
        return colorTomato;
    }

    public void setColor(ColorTomato colorTomato) {
        this.colorTomato = colorTomato;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0) {
            this.dia = dia;
        } else {
            System.err.println("Error! Wrong value!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Tomato tomato = (Tomato) o;

        if (dia != tomato.dia) return false;
        return colorTomato == tomato.colorTomato;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (colorTomato != null ? colorTomato.hashCode() : 0);
        result = 31 * result + dia;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", color = " + colorTomato + ", dia = " + dia;
    }
}

