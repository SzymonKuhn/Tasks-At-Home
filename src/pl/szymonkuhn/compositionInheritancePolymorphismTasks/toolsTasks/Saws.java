package pl.szymonkuhn.compositionInheritancePolymorphismTasks.toolsTasks;

public class Saws extends Tools {
    private int lenght;

    public Saws (String model, double price, int lenght) {
        super(model, price);
        this.lenght=lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return "Saws{" +
                "lenght=" + lenght + " model=" + getModel() + " price=" + getPrice() +
                '}';
    }
}
