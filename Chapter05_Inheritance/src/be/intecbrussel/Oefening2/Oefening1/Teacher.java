/* Schijf een programma waar je de methodes toString (), equals() en hashCode () implementeert en toont hoe runtime
   Polymorphism werkt */

package be.intecbrussel.Oefening2.Oefening1;

public class Teacher extends Person {
    private String teachersId;
    private String subject;
    private String studentName;
    private String parentsName;

    public Teacher(String name, int age, String teachersId, String subject, String studentName, String parentsName) {
        super(name, age);                            // variables from super class.
        this.teachersId = teachersId;
        this.subject = subject;
        this.studentName = studentName;
        this.parentsName = parentsName;
    }
}
