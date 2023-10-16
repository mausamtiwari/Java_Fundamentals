/* Schijf een programma waar je de methodes toString (), equals() en hashCode () implementeert en toont hoe runtime
   Polymorphism werkt */

package be.intecbrussel.Oefening2.Oefening1;

public class Student extends Person {
    private String studendID;
    private String major;

    public Student(String name, int age, String studendID, String major) {
        super(name, age);                                                      // super class arguments
        this.studendID = studendID;                                            // argument from student class.
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studendID='" + studendID + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
