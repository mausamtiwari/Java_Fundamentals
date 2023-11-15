package be.intecbrussel.Les1.NonStaticExamples;

public class AnoniemeMainApp {
    public static void main(String[] args) {
        Anonieme a = new Anonieme(){
            public void run(){
                System.out.println("de run methode van anonieme klasse");
            }
            public void print(){
                System.out.println("Print method van de gewoone klasse");
            }
        };


        a.run();
        a.print();

        Anonieme b = new Anonieme();
        b.run();

    }
}
