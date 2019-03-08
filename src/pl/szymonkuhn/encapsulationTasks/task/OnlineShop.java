package pl.szymonkuhn.encapsulationTasks.task;

import pl.szymonkuhn.encapsulationTasks.task.cart.Cart;
import pl.szymonkuhn.encapsulationTasks.task.item.ItemManager;
import pl.szymonkuhn.encapsulationTasks.task.item.ItemModel;
import pl.szymonkuhn.encapsulationTasks.task.user.UserManager;
import pl.szymonkuhn.encapsulationTasks.task.user.UserModel;

public class OnlineShop {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        ItemManager itemManager = new ItemManager();
        Cart cart = new Cart();

        userManager.createUser("Leonardo", "daVinci", 65);
        UserModel użytkownik1 = userManager.getUser();

        userManager.createUser("Pablo", "Picasso", 55);
        UserModel użytkownik2 = userManager.getUser();

        System.out.println(użytkownik1);

        ItemModel produkt1 = itemManager.createShopItem("Pędzel", "narzędzie do malowania składające się z drewnianej rączki i końcówki z końskiego włosia", 12.50);
        ItemModel produkt2 = itemManager.createShopItem("Rama", "w tej drewnianej ręcznie zdobionej ramie nawet najgorszy obraz będzie się pięknie prezentował", 120.50);
        ItemModel produkt3 = itemManager.createShopItem("Farba", "w każdym kolorze tęczy", 25.60);
        ItemModel produkt4 = itemManager.createShopItem("Sztaluga", "stabilna, drewniana, praktczna", 120.55);

        cart.addItemToCart(produkt1);
        cart.addItemToCart(produkt3);
        cart.addItemToCart(produkt2);
        cart.addItemToCart(produkt3);
        cart.addItemToCart(produkt4);
        cart.addItemToCart(produkt1);
        cart.addItemToCart(produkt3);
        cart.addItemToCart(produkt3);
        cart.addItemToCart(produkt3);
        cart.addItemToCart(produkt1);
        cart.addItemToCart(produkt2);
        cart.addItemToCart(produkt4);

        System.out.println(cart);
        System.out.println("Wartość koszyka: " + cart.sumCart());
        cart.showTitles();
    }
}
