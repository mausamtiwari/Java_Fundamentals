package be.intecbrussel.Oefeningen.Oefening1.Oefening2;

public class Student extends Person {
    protected String studendID;
    protected String major;

    public Student(String name, int age, String studendID, String major) {
        super(name, age);                                                      // super class arguments
        this.studendID = studendID;                                            // argument from student class.
        this.major = major;
    }
    @Override
    public void introduction() {                                              // Method overriding
        super.introduction();                                                 // super class inheritance.
        System.out.println("I am a student with ID " + studendID + " and I am majoring in " + major + ".");
    }

    public void study() {
        System.out.println(getName() + " is studying for exams.");
    }
}
