package pl.szymonkuhn.staticTasks;

public class ProductCart {

    public static void showNames (Product[] products) {
        for (Product product : products){
            System.out.println(product.getName());
        }
    }

    public static double getPriceAndDiscount (Product[] products) {
        double result = 0;
        for (Product product : products) {
            result += (double)product.getPrice();
        }
        result = result - (result * Product.DISCOUNT);
        return result;
    }

    public static double getPrice (Product[] products) {
        double result = 0;
        for (Product product : products) {
            result += (double)product.getPrice();
        }
        return result;
    }

}
