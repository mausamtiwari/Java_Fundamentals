package be.intecbrussel.Oefeningen.Oefening1.Oefening2;

public class Teacher extends Person {
    protected String teachersId;
    protected String subject;
    protected String studentName;
    protected String parentsName;

    public Teacher(String name, int age, String teachersId, String subject, String studentName, String parentsName) {
        super(name, age);                            // variables from super class.
        this.teachersId = teachersId;
        this.subject = subject;
        this.studentName = studentName;
        this.parentsName = parentsName;
    }

    @Override
    public void introduction() {                          // Method overriding
        super.introduction();
        System.out.println("I am a teacher with teacher's Id " + teachersId + ". And I teach " + subject + ".");
    }

    public void teach() {
        System.out.println(getName() + " is giving lecture on " + subject + ".");
    }

    public void attendPTmeeting() {
        System.out.println(getName() + " is attending parent-teacher's meeting for " + studentName + " with " + parentsName + ".");
    }
}
