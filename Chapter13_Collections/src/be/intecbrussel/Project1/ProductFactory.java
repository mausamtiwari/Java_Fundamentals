package be.intecbrussel.Project1;

import java.util.Random;

public class ProductFactory {
    private ProductSorter productSorter;
    private final String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "pear"};
    private final String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private final String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProducts(int amount) {
        Random rand = new Random();

        for (int i = 0; i < amount; i++) {
            int type = rand.nextInt(3);
            String productName;

            if (type == 0) {
                productName = foodProducts[rand.nextInt(foodProducts.length)];

            } else if (type == 1) {
                productName = healthProducts[rand.nextInt(healthProducts.length)];
            } else {
                productName = electricProducts[rand.nextInt(electricProducts.length)];
            }

            int productID = rand.nextInt(151);
            Product product;

            if (type == 0) {
                product = new FoodProduct(productName, productID);
            } else if (type == 1) {
                product = new HealthProduct(productName, productID);
            } else {
                product = new ElectricProduct(productName, productID);
            }

            productSorter.sortProduct(product);
        }


    }
}
