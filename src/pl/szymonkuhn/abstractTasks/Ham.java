package pl.szymonkuhn.abstractTasks;

public class Ham extends Meat {
    public String getTaste() {
        return "Ham's taste!";
    }

    public Ham(String name) {
        super(name);
    }
}
