package be.intecbrussel.Les2.Example5;

public class MainApp {
    public static void main(String[] args) {
        TestInstanceOf object01 = new TestInstanceOf();
        TestInstanceOf test = null;

        DifferentTestClass object02= new DifferentTestClass();

         //Controlelern of object01 een instanceof is van.
        System.out.println("Is Object01 an instance of TestInstanceOf?: " + (object01 instanceof TestInstanceOf));
        System.out.println("is Object01 an instance od DifferentTestClass?: " + (object02 instanceof DifferentTestClass));

        System.out.println("Is test an instance of TestInstanceOf: " +(test instanceof  TestInstanceOf));
        DifferentTestClass.method01(object02);
    }
}
