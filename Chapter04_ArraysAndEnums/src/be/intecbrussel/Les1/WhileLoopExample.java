package be.intecbrussel.Les1;

public class WhileLoopExample {
    public static void main(String[] args) {
        int[] numbersArr = {2, 4, 6, 8, 10};
        int index = 0;
        while (index < numbersArr.length) {
            System.out.println(numbersArr[index]);
            index++;
        }

    }
}
