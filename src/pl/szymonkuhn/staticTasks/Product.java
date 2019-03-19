package pl.szymonkuhn.staticTasks;

import java.time.LocalDate;

public class Product {
    static int count;
    static double DISCOUNT;
    private int id;
    private String name;
    private int price;

    static {
        count = 100;
        LocalDate now = LocalDate.now();
        if (now.getDayOfWeek().getValue()==5) {
            DISCOUNT = 0.3;
        } else {
            DISCOUNT = 1.0;
        }
    }

    {
        count++;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id=count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
