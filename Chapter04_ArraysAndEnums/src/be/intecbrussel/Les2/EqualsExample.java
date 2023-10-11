package be.intecbrussel.Les2;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] array01 = {1,2,3,4};
        int[] array02 = {1,2,3,4};     // equal true
        int[] array03 = {4,3,2,1};     // equal false order is different
        int[] array04 = {1,2,3,4,5};   // equal false length is different
        //long[] array05 = {1,2,3,4};     // equal false error for different datatyoe

        System.out.println("Array01 and array02 are equal: " + Arrays.equals(array01, array02));
        System.out.println("Array01 and array03 are equal: " + Arrays.equals(array01, array03));
        System.out.println("Array01 and array04 are equal: " + Arrays.equals(array01, array04));
        //System.out.println("Are array01 and array05 equal: " + Arrays.equals(array01, array05));
    }
}
