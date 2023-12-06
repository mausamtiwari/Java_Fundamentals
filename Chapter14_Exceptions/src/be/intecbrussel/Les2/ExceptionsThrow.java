package be.intecbrussel.Les2;

public class ExceptionsThrow {
    public static void main(String[] args) {
        ageCheck(2);
    }

    public static void ageCheck(Integer num) throws ArithmeticException{
        if (num < 18) {
            // Gooie exception met java throw Keyword
            throw new RuntimeException("U mag niet stemmen");
        } else {
            System.out.println("U kunt stemen");
        }
    }
}
