package be.intecbrussel.Project1;

import java.time.LocalDate;
import java.util.Objects;


public class Person {
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;

    // All args constructor
    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getDateOfBirth().equals(person.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getDateOfBirth());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


}
