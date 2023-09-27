package be.intecbrussel.Les3.MathExample;

public class MathExample2 {
    public static void main(String[] args) {
        int result01 = Math.max(10, 9);
        double result02 = Math.max(10.3, 9.6);
        long result03 = Math.max(17L, 8L);
        float result04 = Math.max(8F, 30.5F);

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);

        System.out.println(Math.max(3L, 6.5f));
        System.out.println(Math.max(10L, 11.5D));

        int result05 = Math.min(7, 9);
        double result06 = Math.min(1.3, 0.6);
        long result07 = Math.min(12L, 18L);
        float result08 = Math.min(71.5F, 30.5F);

        System.out.println(result05);
        System.out.println(result06);
        System.out.println(result07);
        System.out.println(result08);

        System.out.println(Math.min(30f, 12.5D));
        System.out.println(Math.min(100L, 101.9D));

        double result09 = Math.ceil(4.1);// Gives the biggest integer value near to the given double
        System.out.println(result09);

        double result10 = Math.floor(10.9); // Gives the smallest integer value near to the given double.
        System.out.println(result10);

        double result11 = Math.random(); // generates pseudorandom numbers from 0.0 to 1.0.
        System.out.println(result11);

        double result12 = (Math.random() * 10); // generates pseudorandom numbers from 0.0 to 10.0
        System.out.println(result12);

        double result13 = Math.pow(2, 3);
        System.out.println(result13);


    }
}
