package be.intecbrussel.Project1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductSorter {
    // Created new ArrayLists to store products.
    private List<Product> products = new ArrayList<>();
    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<HealthProduct> healthProducts = new ArrayList<>();
    private List<ElectricProduct> electricProducts = new ArrayList<>();



    // Getters
    public int getNumberOfProducts() {
        return products.size();
    }

    public List<FoodProduct> getFoodProduct() {
        System.out.println("Food Products: " + foodProducts.size());
        return foodProducts;
    }

    public List<HealthProduct> getHealthProduct() {
        System.out.println("Health Products: " + healthProducts.size());
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProduct() {
        System.out.println("Electric Products: " + electricProducts.size());
        return electricProducts;
    }

    // Products added to respective lists according to it types filtering duplicate productIds.
    public void sortProduct(Product product) {
        int productid = product.getProductId();

        // Create a new set for unique productIds. Stores unique productIds.
        Set<Integer> uniqueProductIds = new HashSet<>();
        // Adds product's Id to the uniqueProductIds set.
        for (Product p : products) {
            uniqueProductIds.add(p.getProductId());
        }

        // Checks if new product's Id is not in the set
        if (!uniqueProductIds.contains(productid)) {
            // Adds new product to the main products list if the Id is already not present.
            products.add(product);

            // Adds the new product to the respective types
            if (product instanceof FoodProduct) {
                foodProducts.add((FoodProduct) product);
            } else if (product instanceof HealthProduct) {
                healthProducts.add((HealthProduct) product);
            } else if (product instanceof ElectricProduct) {
                electricProducts.add((ElectricProduct) product);
            }

        }
    }
}


