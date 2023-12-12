package be.intecbrussel.Projecten.Project3_WhyPhoneApp;

public class WhyPhoneApp {
    public static void main(String[] args) {
        WhyPhone phone = new WhyPhone(1200, "iPhone 15 Pro MAx", "Green");   // Created an onbect of whyphone.
        showSpecs(phone);                                                                          // Method ShowSpecs is called.
        phone.getCOLOR();                                                                          // getCOLOR from WhyPhone class is called.

        System.out.println();
        System.out.println("This is an old phone.");

        DummyPhone dummy = new DummyPhone();                                                       // Created an 0bject of DummyPhone and called the methods.
        dummy.startCall("Emergency Number");                                               // DummyPhone only implements interface ISimCard and IRadio.
        dummy.endCall();
        dummy.playChannel(109);
        dummy.changeChannel(104);
    }


    public static void showSpecs(SmartPhone phone) {                  // Created a method name showSpecs with parameter Phone of type SmartPhone. And called every methods SmartPhone class has.
        phone.getPRICE();
        phone.getBRAND();
        phone.shootAPhoto(12);
        phone.viewPhotos();
        phone.locate(123, 567);
        phone.navigate(123.0,567);
        phone.playChannel(102);
        phone.changeChannel(104);
        phone.startCall("Emergency Number");
        phone.endCall();
        phone.connect("Telenet1234");
        phone.disconnect("Telenet1234");

    }
}
