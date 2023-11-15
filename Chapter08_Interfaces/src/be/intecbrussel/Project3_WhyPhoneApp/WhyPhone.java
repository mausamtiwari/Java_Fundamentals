package be.intecbrussel.Project3_WhyPhoneApp;


public class WhyPhone extends SmartPhone {
    private final String COLOR;

    public WhyPhone(double PRICE, String BRAND, String COLOR) {
        super(PRICE, BRAND);
        this.COLOR = COLOR;
    }

    public String getCOLOR() {
        System.out.println("The phone's color is: " +COLOR);
        return COLOR;
    }
}
