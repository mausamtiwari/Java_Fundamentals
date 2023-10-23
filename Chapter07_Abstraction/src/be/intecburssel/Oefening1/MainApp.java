/* • Creëer een abstracte klas Bank met een abstracte methode getBalance.
   • In BankA, BankB en BankC wat de sub klassen zijn, word 1000, 1500 en $ 2000 gestort. Elke bank heeft ook
     een methode getBalance
   • Roep deze methode op en creëer een object van elke klas */

package be.intecburssel.Oefening1;

public class MainApp {
    public static void main(String[] args) {
        Bank mybankA = new BankA();
        mybankA.getBalance();
        Bank myBankB = new BankB();
        myBankB.getBalance();
        Bank myBankC = new BankC();
        myBankC.getBalance();
    }
}
