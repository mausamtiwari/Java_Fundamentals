package be.intecbrussel.StudentScoreProject;

public class Student extends Person {
    private static int incrementId = 0;
    int id;

    public Student() {    // No args constructor

    }

    public Student(String name, String lastName) {   // All args constructor
        super(name, lastName);
        this.id = getIncrementId();
    }

    public int getId() {                            // Id getter
        return id;
    }

    private static int getIncrementId() {           // Method to increase Id.
        return ++incrementId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
