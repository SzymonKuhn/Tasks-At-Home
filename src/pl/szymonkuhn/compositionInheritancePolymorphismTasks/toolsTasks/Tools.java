package pl.szymonkuhn.compositionInheritancePolymorphismTasks.toolsTasks;

public class Tools {
    private String model;
    private double price;

    public Tools(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
