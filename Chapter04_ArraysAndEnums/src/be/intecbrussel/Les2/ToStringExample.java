package be.intecbrussel.Les2;

import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        // get the array
        int[] myArr = {1,2,3,4,5,6,7,8,9,10};

        // Get the String represanttaion of array
        String stringArr = Arrays.toString(myArr);

        // Print the String representation.
        System.out.println("Array: " +stringArr);
    }
}
