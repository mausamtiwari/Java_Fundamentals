/* Maak een nieuwe package met de naam Oefening1 in de Chapter03_Classes module. En maak 2 klassen met de namen
   Calculator en MainCalc in de Oefening1 package. Schrijf het minste 7 methoden in de Calculator klas en roep elke
   methode aan in de MainCalc klas.
   Oefening 1
   Schrijf een methode die het kleinste nummer van 3 nummers kan vinden.
   Oefening 2
   Schrijf een methode om te controleren of elk cijfer van een bepaald geheel getal even is. Is het getal even,
   retourneer dan true als elk cijfer oneven is retourneerd false.
   Voorbeeld data: (8642)->true (123)->false (200)->true.
   Oefening 3
   Schrijf een programma dat berekening kan doen net als een calculator. Het programma moet de volgende methodes hebben:
   - Optellen
   - Aftrekken
   - vermenigvuldigen
   - delen
   - modulus */

package be.intecbrussel.Les1.Oefening1;

public class Calculator {
    public int kleinsteNummer(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);   // Uses Math.min method to find the minumum number.
    }

    public boolean evenOdd(int num1) {
        if (num1 == 0) return true;                     // if the number is 0, it ie even
        while (num1 != 0) {                             // loop runs until the number reaches 0.
            int lastDigit = num1 % 10;                  // This gets the last digit of the number by taking the remainder when divided by 10.
            if (lastDigit % 2 != 0) {                   // This checks if the last digit is even.
                return false;                           // If any digit is odd, this returns false straight away as all digits are not even.
            }
            num1 /= 10;                                 // If last digit is even, the number is divided by 10 to get rid of the last digit and goes to the next iteration.
        }
        return true;                                    // If the loop continues with all the digits even, returns true.
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Divisor can't be 0.");
        }
        return num1 / num2;
    }

    public int mod(int num1, int num2) {                        // this method gets the modulus of two integers
        try {
            return num1 % num2;
        } catch (ArithmeticException e) {
            System.out.println("Divisor can't be 0.");
        }
        return num1;
    }
}

