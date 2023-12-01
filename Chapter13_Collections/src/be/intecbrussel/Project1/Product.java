package be.intecbrussel.Project1;

public class Product {
    private String name;
    private final int productId;

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return name + ' ' + productId;
    }
}
