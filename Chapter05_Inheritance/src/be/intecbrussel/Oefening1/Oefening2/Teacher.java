package be.intecbrussel.Oefening1.Oefening2;

public class Teacher extends Person {
    protected String teachersId;
    protected String subject;

    public Teacher(String name, int age, String teachersId, String subject) {
        super(name, age);
        this.teachersId = teachersId;
        this.subject = subject;
    }

    @Override
    public void introduction() {                          // Method overriding
        super.introduction();
        System.out.println("I am a teacher with teacher's Id " + teachersId + ". And I teach " + subject + ".");
    }

    public void teach() {
        System.out.println(getName() + " is giving lecture on " + subject + ".");
    }
}
