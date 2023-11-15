package be.intecbrussel.Les1.StaticExamples;

public class OC1MainApp {
    public static void main(String[] args) {
        OuterClass1.InnerClass innerclass = new OuterClass1.InnerClass();
        System.out.println("Static inner x = " + innerclass.getStaticInnerX());
    }

}
