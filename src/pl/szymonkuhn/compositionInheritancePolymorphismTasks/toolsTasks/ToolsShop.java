package pl.szymonkuhn.compositionInheritancePolymorphismTasks.toolsTasks;

public class ToolsShop {
    public static void main (String[] arg) {
        Hammers hammer1 = new Hammers("supermłot", 123.29, 5);
        Hammers hammer2 = new Hammers("średniomłot", 99.99, 2);
        Hammers hammer3 = new Hammers("minimłotek", 12.90, 1);
        Saws saw1 = new Saws("Piła duża", 99.99, 120);
        Saws saw2 = new Saws("Piła ryba", 59.99, 50);
        System.out.println(hammer1.toString());
        System.out.println(hammer1.getPrice());
        System.out.println(saw1.toString());
        System.out.println(saw2.getPrice());

        ToolsShopCart toolsShopCart = new ToolsShopCart();
        toolsShopCart.addToolToCart(saw1);
        toolsShopCart.addToolToCart(hammer1);
        toolsShopCart.addToolToCart(hammer3);
        toolsShopCart.addToolToCart(hammer2);
        toolsShopCart.addToolToCart(saw1);
        toolsShopCart.addToolToCart(saw2);
        toolsShopCart.addToolToCart(hammer2);
        toolsShopCart.addToolToCart(hammer1);
        toolsShopCart.addToolToCart(hammer3);
        toolsShopCart.addToolToCart(saw1);
        toolsShopCart.addToolToCart(saw1);
        toolsShopCart.addToolToCart(saw1);
        toolsShopCart.addToolToCart(saw1);
        System.out.println(toolsShopCart.toString());
        System.out.println(toolsShopCart.sumCart());

    }

}
