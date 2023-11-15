package be.intecbrussel.Les1.NonStaticExamples;

public class NSMainApp {
    public static void main(String[] args) {
        NonStaticExample nonStaticExample = new NonStaticExample();
        NonStaticExample.Inner inner = nonStaticExample.new Inner();
        inner.run();
        nonStaticExample.run();
    }

}
