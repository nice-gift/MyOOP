package by.kursy.luschik.chef.model.entity;

public class Tomato extends Vegetable {
    private Color color;
    private int dia;

    public Tomato() {
    }

    public Tomato(String name, double weight, double price, int calories, Color color, int dia) {
        super(name, weight, price, calories);
        this.color = color;
        this.dia = dia;
    }

    public Tomato(Tomato tomato) {
        this(tomato.getName(), tomato.getWeight(), tomato.getPrice(),
                tomato.getCalories(), tomato.color, tomato.dia);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0) {
            this.dia = dia;
        }
        else{
            System.err.println("Error! Wrong value!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Tomato tomato = (Tomato) o;

        if (dia != tomato.dia) return false;
        return color == tomato.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + dia;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color = " + color + ", dia = " + dia;
    }
}

