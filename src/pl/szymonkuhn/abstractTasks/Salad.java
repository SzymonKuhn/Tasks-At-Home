package pl.szymonkuhn.abstractTasks;

public class Salad extends Vegetables {
    public String getTaste() {
        return "Salad's taste!";
    }

    public Salad(String name) {
        super(name);
    }
}
