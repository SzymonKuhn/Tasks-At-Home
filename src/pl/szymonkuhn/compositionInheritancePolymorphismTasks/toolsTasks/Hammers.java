package pl.szymonkuhn.compositionInheritancePolymorphismTasks.toolsTasks;

public class Hammers extends Tools {
    private int weight;

    public Hammers(String model, double price, int weight) {
        super(model, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Hammers{" +
                "weight=" + weight + " model=" + getModel() + " price=" + getPrice() +
                '}';
    }
}
