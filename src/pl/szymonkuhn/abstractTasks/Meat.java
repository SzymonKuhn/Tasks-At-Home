package pl.szymonkuhn.abstractTasks;

abstract class Meat extends Food{

    public FoodType getType () {
        return FoodType.MEAT;
    }

    public Meat (String name) {
        super(name);
    }
}
