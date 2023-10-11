package be.intecbrussel.Les2;

import java.util.Arrays;

public class BinaryClassExample {
    public static void main(String[] args) {
        int[] intArr = {300,200,400,500};
        System.out.println("Before sorting value at index0 " +intArr[0]);
        System.out.println("Before sorting value at index0 " +intArr[2]);
        Arrays.sort(intArr);
        System.out.println("Before sorting value at index0 " +intArr[0]);
        System.out.println("Before sorting value at index0 " +intArr[2]);
        int keyElement = 300;
        System.out.println(keyElement + " found at index "  +Arrays.binarySearch(intArr,keyElement));
    }
}
