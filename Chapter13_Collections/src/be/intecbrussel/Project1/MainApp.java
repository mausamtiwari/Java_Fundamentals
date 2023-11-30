package be.intecbrussel.Project1;

public class MainApp {
    public static void main(String[] args) {
        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);

        productFactory.createProducts(100);
        System.out.println("Food products: " + productSorter.getFoodProductCount());
        System.out.println("Health products: " + productSorter.getHealthProductCount());
        System.out.println("Electric products: " + productSorter.getElectricProductCount());


    }
}
