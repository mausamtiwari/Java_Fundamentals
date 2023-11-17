package be.intecbrussel.StudentInfo;

public abstract class Person {
    String name;
    String lastName;

    public Person() {     // Default constructor

    }

    public Person(String name, String lastName) {   // All args constructor.
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {         // Name getter
        return name;
    }

    public String getLastName() {     // Last Name getter
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
