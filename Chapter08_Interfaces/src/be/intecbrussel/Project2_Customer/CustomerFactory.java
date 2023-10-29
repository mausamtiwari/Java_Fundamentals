package be.intecbrussel.Project2_Customer;

import java.util.Arrays;

public class CustomerFactory {
    public static final String[] NAMES = {"Alex", "John", "Maddy", "Mausam", "Ann"};   // Database of names.

    public static AbstractCustomer getCustomer(String name) {   // If the name is in the database returns the real costumer names.
        for (int index=0; index<NAMES.length; index++) {
            if(Arrays.toString(NAMES).contains(name)){
                return new RealCustomer(name);
            }

        }
        return new NullCustomer();    // If not returns NullCustomer.
    }

}