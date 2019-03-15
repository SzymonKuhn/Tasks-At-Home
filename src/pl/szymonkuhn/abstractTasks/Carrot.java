package pl.szymonkuhn.abstractTasks;

public class Carrot extends Vegetables {
    public String getTaste() {
        return "Carrot's taste!";
    }

    public Carrot(String name) {
        super(name);
    }
}
