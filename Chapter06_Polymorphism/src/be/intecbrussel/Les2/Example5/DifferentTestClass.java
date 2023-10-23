package be.intecbrussel.Les2.Example5;

public class DifferentTestClass extends TestInstanceOf {
    public static void method01(TestInstanceOf test){
        if(test instanceof DifferentTestClass dtc){
            System.out.println("Downcasting works!");

        }
    }
}
