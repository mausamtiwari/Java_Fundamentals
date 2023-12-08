package be.intecbrussel.Project3;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Opdracht1");
        // Created a unique set of patients but in the order they were added. LinkedHashSet maintains the order of
        // insertion of elements.
        Set<Patient> uniquePatient = new LinkedHashSet<>(Patient.getAllPatients());
        uniquePatient.forEach(System.out::println);
        System.out.println();

        System.out.println("Opdracht2");
        // Created a priorityList of patients giving priority to ones having higher temperature,
        // then patients with higher age then patients with insurance.
        Queue<Patient> patientQueue = new LinkedList<>(uniquePatient.stream()
                .sorted(Comparator.comparing(Patient::getTemperature)
                        .thenComparing(Patient::getAge).reversed()
                        .thenComparing(Patient::isInsured))
                .toList());

        patientQueue.forEach(System.out::println);
        System.out.println();

        System.out.println("Opdracht3");
        // Created a HashMap to store patients according to the categories.
        // Used Set<Patient> so that there are only unique patients.
        Map<Integer, Set<Patient>> mapCollection = new HashMap<>();

        // Iterated through the list of unique patients.
        for (Patient patient : uniquePatient) {
            int age = patient.getAge();
            int temperature = patient.getTemperature();
            boolean unknownVirus = patient.isUnknownVirus();
            int category = 5;  // All other patients uncategorised are listed in category 5.

            if (((age <= 65 && temperature >= 38) || temperature >= 40) && unknownVirus) {
                category = 1;
            } else if (temperature >= 38 && unknownVirus) {
                category = 2;
            } else if (unknownVirus && temperature < 38) {
                category = 3;
            } else if (temperature >= 38 && !unknownVirus) {
                category = 4;
            }

            // Checks if the Map contains specified category.
            //If not present, add it to a new HashSet.
            if (!mapCollection.containsKey(category)) {
                mapCollection.put(category, new HashSet<>());
            }

            // Handles exception if the HashSet(mapCollection) is null.
            try {
                //Adds patient to the respective category.
                mapCollection.get(category).add(patient);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }

        // Prints mapCollection.
        for (Map.Entry<Integer, Set<Patient>> category : mapCollection.entrySet()) {
            System.out.println("Category " + category.getKey() + ": " + category.getValue());
        }

        System.out.println();
        System.out.println("PatientQueue after categorisation.");
        patientQueue.removeAll(uniquePatient);
        System.out.println(patientQueue);
    }

}



