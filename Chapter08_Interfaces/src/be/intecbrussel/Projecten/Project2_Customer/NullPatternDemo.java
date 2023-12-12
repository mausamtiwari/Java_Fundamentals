package be.intecbrussel.Projecten.Project2_Customer;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Maddy");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Mausam");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}

