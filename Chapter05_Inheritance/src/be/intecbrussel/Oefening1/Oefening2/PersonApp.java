package be.intecbrussel.Oefening1.Oefening2;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Harry", 55);     // Initialize a person class
        person.introduction();                                  // Inherits method from super class and also from subclass.
        System.out.println();

        Student student = new Student("Mausam", 28, "2akc357", "Software Engineering");
        student.introduction();
        student.study();
        System.out.println();

        Parent parent = new Parent("Tirtha", 57, "Mausam", "Johan");
        parent.introduction();
        parent.attendPTmeeting();
        System.out.println();

        Teacher teacher = new Teacher("Johan", 44, "a320018", "Java", "Mausam", "Tirtha");
        teacher.introduction();
        teacher.teach();
        teacher.attendPTmeeting();


    }
}
