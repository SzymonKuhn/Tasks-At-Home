package pl.szymonkuhn.abstractTasks;

public abstract class Food {
    private String name;

    public String getName() {
        return name;
    }

    public abstract String getTaste();
    public abstract FoodType getType();

    public Food (String name) {
        this.name = name;
    }

    public String describe() {
        return "Name: " + getName() + ". It's " + getType() + ". It' taste is: " + getTaste();
    }
}
