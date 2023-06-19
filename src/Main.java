import models.Product;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Product a = new Product(
                "001",
                "Mela",
                0.5
        );

        Product b = new Product(
                "002",
                "Pera",
                0.6
        );

        Product c = new Product(
                "003",
                "Banana",
                0.55
        );

        Map<String,Product> storage = new HashMap<>();

        storage.put(a.getId(), a);
        storage.put(b.getId(), b);
        storage.put(c.getId(), c);


        //Display the total number of products in the inventory.
        System.out.println("Numero di prodotti nello storage: " + storage.size());

        // Display the details of a specific product by providing its ID.
        String productId = "002";
        Product product = storage.get(productId);
        System.out.println("ID " + productId);
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());

        //Remove a product from the inventory by providing its ID.
        storage.remove(productId);

        // Update the price of a product by providing its ID.
        String productUpdate = "001";
        double newPrice = 0.45;
        Product productToUpdate = storage.get(productUpdate);
        productToUpdate.setPrice(newPrice);
        System.out.println("Updated price of " + productUpdate + " is " + newPrice);

        // Calculate and display the total value of the inventory (the sum of all product prices).
        double total = 0.0;
        for (Product p : storage.values()) {
            total += p.getPrice();
        }
        System.out.println("Total value: " + total);

    }
}