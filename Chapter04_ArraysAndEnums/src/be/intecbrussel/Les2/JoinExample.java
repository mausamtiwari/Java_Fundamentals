package be.intecbrussel.Les2;

public class JoinExample {
    public static void main(String[] args) {
        String[] strArrayToString = {"Intec", "Brussel", "is", "the", "Best!"};

        // De array omzetten naar string met een spatie tussen de woorden.
        String itIsNowAString = String.join(" ",strArrayToString);

        // De arrar omzetten naar string met een koppelstreepje tussen de woorden.
        String itIsNowAStringWithHyphen = String.join("-", strArrayToString);

        // Printen van de nieuwe string
        System.out.println(itIsNowAString);
        System.out.println(itIsNowAStringWithHyphen);
    }
}
