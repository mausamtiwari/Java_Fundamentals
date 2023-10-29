package be.intecbrussel.Project2_Customer;

public class NullCustomer extends AbstractCustomer {
    String literal = "Not available in Costumer database";

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {              // If the customer name is not in the database, returns literal.
        return literal;
    }
}
