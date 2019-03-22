package pl.szymonkuhn.collectionsTasks;


import java.lang.reflect.Array;
import java.util.*;

public class MapsTasks {

    public static void main(String[] args) {
        Product product = new Product(5, "Jabłko");
        Product product2 = new Product(2, "Gruszka");
        Product product3 = new Product(6, "Śliwka");
        Product product4 = new Product(4, "Truskawka");
        Product product5 = new Product(1, "Marchewka");
        Product product6 = new Product(3, "Sałata");
        Product product7 = new Product(7, "Kapusta");
        Product product8 = new Product(8, "Pietruszka");
        List<Product> listOfProducts = Arrays.asList(product, product2, product3, product4, product5, product6, product7, product8);
        System.out.println(listOfProducts);
        System.out.println();

        Map<Integer, Product> mapOfProducts = createMapFromArray(listOfProducts);
        System.out.println(mapOfProducts);


    }

    static public Map<Integer, Product> createMapFromArray(List<Product> listOfProducts) {
//        Map<Integer, Product> mapOfProducts = new HashMap<>();
//        Map<Integer, Product> mapOfProducts = new LinkedHashMap<>();
        Map<Integer, Product> mapOfProducts = new TreeMap<>();
        for (Product product : listOfProducts) {
            mapOfProducts.put(product.getId(), product);
        }

        return mapOfProducts;
    }

}
