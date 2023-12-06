/* 1. Maak een Path die verwijst naar de volgende relatieve paden(de ##### vervang je door jouw naam.
      De +++++ is de naam van jouw instructeur):
      “../../From#####To+++++/message.txt” en “../../From#####To+++++/animal.txt”

   2. Zorg ervoor dat je die folder en files aanmaakt via de Files klasse, en gebruik methodes die kijken
      of de files en folder bestaan

   3. Schrijf een leuke persoonlijke tekst in de file ”message.txt”, misschien een leuke mop, of een leuk feitje.
      Lees het dan uit. FileReader en FileWriter!!! Buffered is ok.

   4. Maak dan een aparte nieuwe klasse van je lievelingsdier, geef die als variabele String name, en boolean edible.
      Maak een instantie van die klasse.

   5. Sla het dier op in “animal.txt”, en lees het uit.
      Dit wegschrijven gebeurt allemaal in de main app.*/

package be.intecbrussel.Oefeningen;

import java.io.*;

public class Oefening1 {
    public static void main(String[] args) {

        try {
            // MAke a new folder FromMausamToHilal
            new File("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal").mkdir();
            // Checks if the folder exists. Returns true if exists.
            File checkFile = new File("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal");
            boolean FromHilalToMausamExists = checkFile.exists();
            System.out.println("FromMausamToHilal folder exists? \n" + FromHilalToMausamExists + " \n");

            // BufferedWriter
            try {
                // Creates a file message.txt and writes texts.
                BufferedWriter messageWriter = new BufferedWriter(new FileWriter("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal/message.txt"));
                messageWriter.write("\n1- What’s the difference between a hippo and a zippo?");
                messageWriter.write("\nOne’s pretty heavy and the other’s a little lighter.");
                messageWriter.write("\n2- What's the best smelling insect?");
                messageWriter.write("\nA deodor-ant.");
                messageWriter.write("\n3- What do you call a bear without any teeth?");
                messageWriter.write("\nA gummy bear.");
                messageWriter.write("\n4- What falls, but never needs a bandage?");
                messageWriter.write("\nThe rain.");
                messageWriter.write("\n5- What kind of candy do astronauts like?");
                messageWriter.write("\nMars bars.");
                messageWriter.close();

                BufferedWriter animalWriter = new BufferedWriter(new FileWriter("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal/animal.txt"));
                animalWriter.write("\n1- Fleas can jump 350 times its body length.");
                animalWriter.write("\n2- Hummingbirds are the only birds that can fly backwards.");
                animalWriter.write("\n3- Crocodiles cannot stick their tongue out.");
                animalWriter.write("\n4- Starfish do not have a brain.");
                animalWriter.write("\n5- Slugs have 4 noses.");
                animalWriter.write("\n6- Only female mosquitoes bite.");
                animalWriter.write("\n7- Polar bear skin is black!");
                animalWriter.write("\n8- The only mammal capable of flight is the bat.");
                animalWriter.write("\n9- A newborn kangaroo is the size of a bean.");
                animalWriter.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // BufferederedReader
        try {
            // Checks if message.txt file esists in the path.
            File checkMessage = new File("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal/message.txt");
            boolean messageExists = checkMessage.exists();
            System.out.println("message.txt file exists? \n" + messageExists);

            // Reads message.txt
            BufferedReader messageReader = new BufferedReader(new FileReader("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal/message.txt"));
            String line;

            while ((line = messageReader.readLine()) != null) {
                System.out.println(line);
            }

            // Checks if animal.txt file esists in the path.
            File checkAnimal = new File("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal");
            boolean animalExists = checkAnimal.exists();
            System.out.println("\nAnimal.txt file exists? \n" + animalExists);

            // Reads animal.txt
            BufferedReader animalReader = new BufferedReader(new FileReader("/Users/asuratya/Downloads/Java Resources/FromMausamToHilal/animal.txt"));

            while ((line = animalReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the object to file and prints.
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("animal.txt"));
            Lion lion = (Lion) objectInputStream.readObject();
            System.out.println("\n" + lion.name + " " + lion.edible);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
