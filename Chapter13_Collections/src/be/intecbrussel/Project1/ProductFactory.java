package be.intecbrussel.Project1;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    // Constructor with productSorter as parameter.
    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    // Creates product
    public void createProducts(int amount) {
        // Random object to generate random numbers.
        Random rand = new Random();

        // Creates the specified products based on random type using switch satement..
        for (int i = 0; i < amount; i++) {
            // Random type generator. 1,2 0r 3.
            int type = rand.nextInt(3);
            String productName = " ";
            int productId = rand.nextInt(151);
            Product product = null;

            // Creates product based on random type.
            switch (type) {
                case 0 -> {
                    // Chooses a random name from foodProduct array.
                    productName = foodProducts[rand.nextInt(foodProducts.length)];
                    // Creates a new FoodProduct object with generatedn name and Id.
                    product = new FoodProduct(productName, productId);
                }
                case 1 -> {
                    // Chooses a random name from healthProduct array.
                    productName = healthProducts[rand.nextInt(healthProducts.length)];
                    // Creates a new HealthProduct object with generatedn name and Id.
                    product = new HealthProduct(productName, productId);
                }
                case 2 -> {
                    // Chooses a random name from electricProduct array.
                    productName = electricProducts[rand.nextInt(electricProducts.length)];
                    // Creates a new ElectricProduct object with generatedn name and Id.
                    product = new ElectricProduct(productName, productId);
                }
                default -> System.out.println("Invalid type: " + type);
            }

            // Sorts the product using productSorter.
            productSorter.sortProduct(product);
        }


    }
}
