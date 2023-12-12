package be.intecbrussel.Oefeningen.Oefening3;

public interface Vehicle extends Switch, Motor{
    void openDoor(int door);
    void closeDoor(int door);
}
