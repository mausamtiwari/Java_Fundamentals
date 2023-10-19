package be.intecbrussel.Les1.Example4;

public class MainApp {
    public static void main(String[] args) {
        // Upcasting
        Parent parent = new Child();
        parent.name = "IntecBrussel";

        // Afdrukken van de naam van de bovenliggende klasse
        System.out.println(parent.name);

        // De klassemethode parent is een overschreven methode en daarom wordt deze uitgevoerd.
        parent.method();

        // Impliciet proberen te downcasten. U krijgt een compileerfout.
        //Child child = new Parent();

        // Downcasting Explicitly

        Child child = (Child)parent;
        System.out.println(child.name);

    }



}
