package be.intecbrussel.Les2;


public class SplitExample {
    public static void main(String[] args) {
        String myStr = "Java is the best";
        // Hier splitten we de string op een soatie.
        String[] strArray = myStr.split(" ");

        // Oorspronkelijke string uitprinten.
        System.out.println("String: " + myStr);

        // Loop door de string.
        for (int index = 0; index < strArray.length; index++) {

            // Printen van de index met de waarde.
            System.out.println("Index: " + index + " value of the element: " + strArray[index]);
        }
    }
}
