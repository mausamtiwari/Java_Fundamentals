package be.intecbrussel.Les2;

import java.util.Arrays;

public class sortExample {
    public static void main(String[] args) {
        int[] myArr = {10,-20,33,9,97,-65,345};

        System.out.println("The original myArr is: ");
        for(int num: myArr){
            System.out.print(num + " ");
        }

        Arrays.sort(myArr,0,4);

        System.out.println("\nThe sorted myArr with a range from 0 to 4: ");
        for(int num : myArr){
            System.out.print(num + " ");
        }

        Arrays.sort(myArr);

        System.out.println("\nThe whole myArr is: ");
        for (int num: myArr){
            System.out.print(num + " ");
        }
    }
}
