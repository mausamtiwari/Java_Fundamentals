package be.intecbrussel.Les3.Bank;

public class Bank {
    private boolean enoughOnBankAccount = false;
    private int moneyOnBankAccount = 1000;

    public boolean isEnoughOnBankAccount() {
        return enoughOnBankAccount;
    }

    public void setEnoughOnBankAccount(boolean enoughOnBankAccount) {
        this.enoughOnBankAccount = enoughOnBankAccount;
    }

    public int getMoneyOnBankAccount() {
        return moneyOnBankAccount;
    }

    public void setMoneyOnBankAccount(int moneyOnBankAccount) {
        this.moneyOnBankAccount = moneyOnBankAccount;
    }

    // Deze methode wordt gesynchroniseerd en vervolgens stuurt het een notificatie naar eventuele wachtende threads
    //zodra het bedrag op de bankrekening hoger wordt dan 3000.
    public synchronized void addAmountPerMonth(int yourPay) {
        moneyOnBankAccount += yourPay;
        if (moneyOnBankAccount > 3000) {
            enoughOnBankAccount = true;
        }
        // notify() wordt gebruikt om threads te waarschuwen die wachten op dit object in een wait()-toestand.
        notify();
    }

    public synchronized void payBills(int amountBills) {
        while (!enoughOnBankAccount) {
            try {
                // wait() laat de thread wachten tot er voldoende geld is.
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        moneyOnBankAccount -= amountBills;
        // notify() waarchuwt andere threads dat er genoeg geld is om de rekening is betalen.
        notify();
    }


}
