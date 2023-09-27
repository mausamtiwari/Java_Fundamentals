package be.intecbrussel.Opdracht1;

public class ForExample2 {
    public static void main(String[] args) {

        for (int num = 0; num < 200; num++) {
            if (num % 3 == 0) { // veelvouden van 3
                System.out.println(num);
            }
        }
    }
}
