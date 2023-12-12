package be.intecbrussel.Projecten.Project3_WhyPhoneApp;

public class DummyPhone implements ISimCard, IRadio {
    @Override
    public void playChannel(double fm) {
        System.out.println("Playing channel " + fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Changing channel to " + fm);
    }

    @Override
    public void startCall(String number) {
        ISimCard.super.startCall(number);
    }

    @Override
    public void endCall() {
        ISimCard.super.endCall();
    }


}
