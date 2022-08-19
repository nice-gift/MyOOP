package by.kursy.luschik.chef.model.entity;

public class Cucumber extends Vegetable {
    PeelPattern pattern;

    public Cucumber() {
        pattern = PeelPattern.GERMAN;
    }

    public Cucumber(String name, double weight, double price, int calories,
                    PeelPattern pattern) {
        super(name, weight, price, calories);
        this.pattern = pattern;
    }

    public Cucumber(Cucumber cucumber) {
        this(cucumber.getName(), cucumber.getWeight(), cucumber.getPrice(),
                cucumber.getCalories(), cucumber.pattern);
    }

    public PeelPattern getPattern() {
        return pattern;
    }

    public void setPattern(PeelPattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Cucumber cucumber = (Cucumber) o;
        return pattern == cucumber.pattern;
    }

    @Override
    public int hashCode() {
        int code = 31;
        int hash = code * super.hashCode() + pattern.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + ", pattern = " + pattern;
    }
}
