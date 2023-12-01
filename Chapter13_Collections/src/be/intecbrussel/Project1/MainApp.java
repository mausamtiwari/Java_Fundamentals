package be.intecbrussel.Project1;

public class MainApp {
    public static void main(String[] args) {
        // Instantiated ProductSorter.
        ProductSorter productSorter = new ProductSorter();
        // Instantiated ProductFactory, passing ProductSorter.
        ProductFactory productFactory = new ProductFactory(productSorter);

        // 100 products created
        productFactory.createProducts(100);

        System.out.println("1 - Food products: " + productSorter.getFoodProduct());
        System.out.println("2 - Health products: " + productSorter.getHealthProduct());
        System.out.println("3 - Electric products: " + productSorter.getElectricProduct());
        System.out.println();

        System.out.println("Total products: " + productSorter.getNumberOfProducts());

    }
}
