package be.intecbrussel.Les5.Map.Example;

public enum Coin {
    ONE_CENT( 0.01),
    TWO_CENTS(0.2),
    FIVE_CENTS(0.5),
    TEN_CENTS(0.10),
    TWENTY_CENTS(0.20),
    FIFTY_CENTS(0.50),
    ONE_EUROS(1),
    TWO_EUROS(2);

    private double value;
    private Coin(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
