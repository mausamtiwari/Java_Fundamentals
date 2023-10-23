package be.intecbrussel.Les1;

import java.util.Arrays;

public class ArraysExample2 {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 100;
        myArr[1] = 200;
        myArr[2] = 300;
        myArr[3] = 400;
        myArr[4] = 500;

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        System.out.println();

        for (int j : myArr) {
            System.out.println(j);
        }

        System.out.println();

        System.out.println(Arrays.toString(myArr));
    }


}
