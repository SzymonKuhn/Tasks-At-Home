package pl.szymonkuhn.encapsulationTasks.task;

import pl.szymonkuhn.encapsulationTasks.task.item.ItemManager;
import pl.szymonkuhn.encapsulationTasks.task.user.UserManager;
import pl.szymonkuhn.encapsulationTasks.task.user.UserModel;

public class OnlineShop {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        ItemManager itemManager = new ItemManager();

        userManager.createUser("Leonardo", "daVinci", 65);
        UserModel użytkownik1 = userManager.getUser();

        userManager.createUser("Pablo", "Picasso", 55);
        UserModel użytkownik2 = userManager.getUser();

        System.out.println(użytkownik1);
    }
}
