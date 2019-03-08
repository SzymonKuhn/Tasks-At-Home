package pl.szymonkuhn.encapsulationTasks.task.item;

public class ItemModel {
    private String title;
    private String description;
    private double price;
    ItemUtil itemUtil = new ItemUtil();

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    ItemModel(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "title='" + title + '\'' +
                ", description='" + itemUtil.truncate(description, 20) + '\'' +
                ", price=" + price +
                '}';
    }
}
