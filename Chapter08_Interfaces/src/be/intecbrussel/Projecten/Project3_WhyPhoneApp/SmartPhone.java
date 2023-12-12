package be.intecbrussel.Projecten.Project3_WhyPhoneApp;

public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi {      // SmartPhone implements all interafaces
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;



    public SmartPhone(double PRICE, String BRAND) {                             // Constructor with PRICE and BRAND as parameters
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    public double getPRICE() {
        System.out.println("The phone costs: €" + PRICE);
        return PRICE;
    }

    public String getBRAND() {
        System.out.println("The brand name is: " + BRAND);
        return BRAND;
    }



    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println("Shooting " + amountOfPhotos + "photos.");
        numberOfPhotos += amountOfPhotos;

    }

    @Override
    public String[] viewPhotos() {
        String[] photos = new String[numberOfPhotos];
        for (int i=0; i < photos.length; i++) {
            photos[i] = "Photo" + i + ".jpg";
        }
        return photos;

    }

    @Override
    public String locate(double latitude, double longitude) {
        return "Latitude " + latitude + "Longitude" + longitude;
    }

    @Override
    public void navigate(double latitude, double longitude) {
        System.out.println("Navigating to " + latitude+ " , " + longitude);
    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Playing " + fm + " FM");
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Changing to " + fm + "FM");
    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("Connecting  " + internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Disconnecting " + internetConnection);
    }
}
