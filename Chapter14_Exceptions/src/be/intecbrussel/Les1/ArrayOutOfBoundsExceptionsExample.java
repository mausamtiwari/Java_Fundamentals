package be.intecbrussel.Les1;

public class ArrayOutOfBoundsExceptionsExample {
    public static void main(String[] args) {
        String[] maanden = {"Januari", "February", "Maart", "April"};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(maanden[i] + " ");
            }

        } catch (ArrayIndexOutOfBoundsException exceptions) {
            System.out.println(exceptions.getMessage());
            System.out.println("Index out of bound.");
        }
    }
}
