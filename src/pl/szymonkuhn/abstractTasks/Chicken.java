package pl.szymonkuhn.abstractTasks;

public class Chicken extends Meat {

    public String getTaste() {
        return "Chicken taste!";
    }

    public Chicken(String name) {
        super(name);
    }
}
