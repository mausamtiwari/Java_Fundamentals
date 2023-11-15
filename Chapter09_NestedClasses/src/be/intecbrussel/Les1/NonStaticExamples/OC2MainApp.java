package be.intecbrussel.Les1.NonStaticExamples;


public class OC2MainApp {
    public static void main(String[] args) {
        OuterClass2 myOuter = new OuterClass2();
        OuterClass2.Innerclass myInner = myOuter.new Innerclass();
        System.out.println(myInner.y + myOuter.x);
    }
}
