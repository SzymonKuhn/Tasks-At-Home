package pl.szymonkuhn.encapsulationTasks.task.cart;

import pl.szymonkuhn.encapsulationTasks.task.item.ItemModel;

import java.util.Arrays;

public class Cart {
    private ItemModel[] cart = new ItemModel[10];

    public void addItemToCart (ItemModel item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        System.out.println("Koszyk jest pełny");
    }

    public double sumCart () {
        double result = 0.00;
        for (int i = 0; i < cart.length; i++) {
            result += cart[i].getPrice();
        }
        return result;
    }

    public void showTitles() {
        System.out.print("W koszyku znajdują się: ");
        for (int i = 0; i < (cart.length - 1); i++) {
            System.out.print(cart[i].getTitle() + ", ");
        }
        System.out.print(cart[(cart.length-1)].getTitle() + ".");
    }


    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + Arrays.toString(cart) +
                '}';
    }
}
