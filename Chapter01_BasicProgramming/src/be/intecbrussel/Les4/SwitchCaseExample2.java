package be.intecbrussel.Les4;

public class SwitchCaseExample2 {
    public static void main( String[] args){
        String str= "we";

        // This is a fall through. If we do not use break after each case. It executes every case.
        switch (str){
            case "I":
                System.out.println("I want to become a doctor.");
                //break;
            case "we":
                System.out.println("We are Indian.");
                //break;
            case "you":
                System.out.println("You are my crony friend.");
                //break;
            case"our":
                System.out.println("Our Indian flag has tri-colour.");
                //break;
            default:
                System.out.println(("It is the default statement"));
        }

    }
}
