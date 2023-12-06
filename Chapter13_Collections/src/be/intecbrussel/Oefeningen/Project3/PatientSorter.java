package be.intecbrussel.Oefeningen.Project3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PatientSorter {

    static void patientSorters() {
        List<Patient> allPatients = new ArrayList<>();
       Set<Patient> linkedHashSet = new LinkedHashSet<>();
       linkedHashSet.addAll(allPatients);
        System.out.println(linkedHashSet);

    }
}
