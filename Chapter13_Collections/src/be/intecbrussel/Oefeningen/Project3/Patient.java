package be.intecbrussel.Oefeningen.Project3;

import java.util.*;
import java.util.stream.Collectors;

public class Patient {
    String nationalRegistryNumber;
    String fullName;
    int age;
    int temperature;
    boolean unknownVirus;
    boolean insured;

    public Patient(String nationalRegistryNumber, String fullName, int age, int temperature, boolean unknownVirus, boolean insured) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.fullName = fullName;
        this.age = age;
        this.temperature = temperature;
        this.unknownVirus = unknownVirus;
        this.insured = insured;
    }

    public String getNationalRegistryNumber() {
        return nationalRegistryNumber;
    }

    public void setNationalRegistryNumber(String nationalRegistryNumber) {
        this.nationalRegistryNumber = nationalRegistryNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isUnknownVirus() {
        return unknownVirus;
    }

    public void setUnknownVirus(boolean unknownVirus) {
        this.unknownVirus = unknownVirus;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public static List<Patient> getAllPatients() {
        List<Patient> allPatients = new ArrayList<>();
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("030201321", "Lucky Luke", 69, 38, true, false));
        allPatients.add(new Patient("030201322", "Stromae Papaoutai", 35, 40, false, true));
        allPatients.add(new Patient("030801321", "Gringoire Lune", 80, 36, true, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030244321", "Sanic the HedgeHog", 16, 37, true, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("088201321", "Bilbo Baggins", 23, 39, true, false));
        allPatients.add(new Patient("035501321", "Lucio Correa Dos Santos", 40, 38, false, true));
        allPatients.add(new Patient("030206621", "Doctor Who", 33, 35, true, true));
        allPatients.add(new Patient("030245321", "Luke Cage", 46, 41, true, false));
        allPatients.add(new Patient("030298321", "Naruto Uzumaki", 13, 38, false, false));
        allPatients.add(new Patient("125201321", "Billy Batson", 15, 40, true, false));
        allPatients.add(new Patient("987201321", "Joseph Joestar", 75, 36, true, false));
        allPatients.add(new Patient("645201321", "Jon Snow", 33, 35, false, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("582201321", "Alexander Hamilton", 65, 38, false, false));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201231", "Zelda of Hyrule", 17, 38, false, true));
        allPatients.add(new Patient("830208651", "Mother Theresa", 98, 39, true, false));
        allPatients.add(new Patient("030209741", "Willy Wonka", 70, 40, true, true));
        allPatients.add(new Patient("030205411", "Scrooge McDuck", 73, 38, true, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("030209861", "Sonia Magnlia", 35, 39, false, false));
        allPatients.add(new Patient("030278921", "Peter Parker", 21, 40, true, false));
        allPatients.add(new Patient("030269821", "Bruce Wayne", 46, 35, false, true));
        allPatients.add(new Patient("030215421", "Seto Kaiba", 22, 38, false, true));
        allPatients.add(new Patient("030296321", "Mario Mario", 50, 37, false, false));
        allPatients.add(new Patient("035051321", "Harry Potter", 18, 39, true, true));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("036781321", "Mary Poppins", 38, 38, true, false));
        allPatients.add(new Patient("033691321", "Alexander the Great", 51, 37, false, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201000", "Huey Freeman", 12, 40, false, false));
        allPatients.add(new Patient("000201321", "Miku Hatsune", 16, 36, true, true));
        allPatients.add(new Patient("111201321", "Drake Josh", 33, 38, true, false));
        allPatients.add(new Patient("222201321", "April O'Neil", 29, 37, false, false));
        return allPatients;
    }

    public static void patientSorter() {
        Set<Patient> patientSort = new LinkedHashSet<>(getAllPatients());
        System.out.println(patientSort);
    }

    public static void tempAgePriority() {
        try {
            PriorityQueue<Patient> pq = new PriorityQueue<>(getAllPatients());
            Comparator.comparing(Patient::getTemperature)
                    .thenComparing(Patient::getAge);
            System.out.println(pq.poll());
        } catch (ClassCastException e) {
            System.out.println("Works");
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient patient)) return false;
        return getAge() == patient.getAge() && getTemperature() == patient.getTemperature() && isUnknownVirus() == patient.isUnknownVirus() && isInsured() == patient.isInsured() && getNationalRegistryNumber().equals(patient.getNationalRegistryNumber()) && getFullName().equals(patient.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNationalRegistryNumber(), getFullName(), getAge(), getTemperature(), isUnknownVirus(), isInsured());
    }

    @Override
    public String toString() {
        return nationalRegistryNumber + " " + fullName + " " + age + " " + temperature + " " + unknownVirus + " " + insured;
    }
}
