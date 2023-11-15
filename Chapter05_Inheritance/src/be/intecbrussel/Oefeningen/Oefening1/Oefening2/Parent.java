package be.intecbrussel.Oefeningen.Oefening1.Oefening2;

public class Parent extends Person {
    protected String childsName;
    protected String teachersName;

    public Parent(String name, int age, String childsName, String teachersName) {
        super(name, age);                                          // Arguments from super class
        this.childsName = childsName;                               // Arguments from this class.
        this.teachersName = teachersName;
    }

    public void introduction() {                                  // Method overriding
        super.introduction();
        System.out.println("I am the parent of " + childsName + ".");
    }

    public void attendPTmeeting() {
        System.out.println(getName() + " is attending parent-teacher's meeting for " + childsName + " with " + teachersName + ".");
    }

}
