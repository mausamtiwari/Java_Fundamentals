/* Schijf een programma waar je de methodes toString (), equals() en hashCode () implementeert en toont hoe runtime
   Polymorphism werkt */

package be.intecbrussel.Oefening2.Oefening1;

public class Parent extends Person {
    protected String childsName;
    protected String teachersName;

    public Parent(String name, int age, String childsName, String teachersName) {
        super(name, age);                                          // Arguments from super class
        this.childsName = childsName;                               // Arguments from this class.
        this.teachersName = teachersName;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "childsName='" + childsName + '\'' +
                ", teachersName='" + teachersName + '\'' +
                '}';
    }
}
