package be.intecbrussel.Project1;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
    List<Product> products = new ArrayList<>();
    List<FoodProduct> foodProducts = new ArrayList<>();
    List<HealthProduct> healthProducts = new ArrayList<>();
    List<ElectricProduct> electricProducts = new ArrayList<>();

    public List<FoodProduct> getFoodProductCount() {
        return new ArrayList<>(foodProducts);
    }

    public List<HealthProduct> getHealthProductCount() {
        return new ArrayList<>(healthProducts);
    }

    public List<ElectricProduct> getElectricProductCount() {
        return new ArrayList<>(electricProducts);
    }

    public void sortProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);

            products.add(product);
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
