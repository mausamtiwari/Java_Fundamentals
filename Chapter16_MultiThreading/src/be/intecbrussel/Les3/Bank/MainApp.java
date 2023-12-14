package be.intecbrussel.Les3.Bank;

public class MainApp {
    public static void main(String[] args) {
        Bank bankrekening = new Bank();

        // Voorbeeld van een slaris van een werknemer.
        int jouwSalaris = 2500;

        // Voeg het salaris aan de bankrekeingin toe aan het begin van de maand.
        bankrekening.addAmountPerMonth(jouwSalaris);

        // Voorbeeld van een bedrag voor rekeningen.
        int bedragRekeningen = 1500;

        // Betaal de rekeningen.
        bankrekening.payBills(bedragRekeningen);

        //Toon de status van de bankrekening op het scherm.
        System.out.println("Bankrekening status ");
        System.out.println("Total Geld: " + bankrekening.getMoneyOnBankAccount());
        System.out.println("Genoeg Geld aanwezig? " + bankrekening.isEnoughOnBankAccount());
    }
}
