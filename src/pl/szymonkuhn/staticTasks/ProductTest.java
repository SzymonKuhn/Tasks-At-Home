package pl.szymonkuhn.staticTasks;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("książka", 52);
        Product product2 = new Product("zeszyt", 15);
        Product product3 = new Product("długopis", 10);
        Product product4 = new Product("ołówek", 9);
        Product product5 = new Product("kartki", 33);
        Product product6 = new Product("flamaster", 22);
        Product product7 = new Product("sznurek", 12);

        Product[] products = new Product[] {product1, product2, product3, product4, product5, product6, product7};
        ProductCart.showNames(products);
        System.out.println("Cena bez rabatu: " + ProductCart.getPrice(products));
        System.out.println("Cena z uwzględnieniem rabatu: " + ProductCart.getPriceAndDiscount(products));


//        System.out.println(Product.count);
    }
}
