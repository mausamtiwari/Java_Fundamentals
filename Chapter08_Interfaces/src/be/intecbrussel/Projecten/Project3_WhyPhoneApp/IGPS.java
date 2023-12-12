package be.intecbrussel.Projecten.Project3_WhyPhoneApp;

public interface IGPS {
    String locate(double latitude, double longitude);

    void navigate(double latitude, double longitude);
}
