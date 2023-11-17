package be.intecbrussel.StudentInfo;

import java.util.Arrays;
import java.util.Comparator;


public class ScoreInfoService {
    static Student[] students = studentArray();
    private final ScoreInfo[] scoreInfos = scoreData();

    // Method studentArray returns an array of type Student.
    private static Student[] studentArray() {
        return new Student[]{
                new Student("Jude", "Bellingham"),
                new Student("Dani", "Carvajal"),
                new Student("Luis", "Enrique"),
                new Student("Luka", "Modric"),
                new Student("Nacho", "Fernandez"),
                new Student("Toni", "Kroos"),
                new Student("Vinicius", "Junior"),
                new Student("John", "Doe"),
                new Student("Eden", "Hazard"),
                new Student("Gerard", "Pique"),
        };
    }

    // Method scoredata returns an array of type ScoreInfo.
    // ScoreInfo[] contains Student[] with their respective scores.
    private static ScoreInfo[] scoreData() {
        return new ScoreInfo[]{
                new ScoreInfo(91, students[0]),
                new ScoreInfo(85, students[1]),
                new ScoreInfo(88, students[2]),
                new ScoreInfo(80, students[3]),
                new ScoreInfo(82, students[4]),
                new ScoreInfo(100, students[5]),
                new ScoreInfo(55, students[6]),
                new ScoreInfo(58, students[7]),
                new ScoreInfo(50, students[8]),
                new ScoreInfo(52, students[9]),
        };
    }

    // No args constructor
    public ScoreInfoService() {

    }

    // Gets student details. Prints students according to their ID.
    public void getStudents() {
        Arrays.stream(scoreInfos)
                .forEach(s -> System.out.println(
                        "ID: " + s.getStudent().getId()
                                + "| Name: " + s.getStudent().getName()
                                + " " + s.getStudent().getLastName()
                                + "| Score: " + s.getScore()));
    }

    // Gets totoal number of students.
    public long getNumberOfStudents() {
        return Arrays.stream(scoreInfos)
                .count();                   // Counts the elements.
    }


    // Calculates average score.
    public void calculateAverageScore() {
        double averageScore = Arrays.stream(scoreInfos)
                .mapToDouble(ScoreInfo::getScore)    // Gets score from ScoreInfo and converts to double.
                .average()                           // Calculates the average
                .orElse(0.0);                  // If the value is present returns else returns 0.0;
        System.out.println("The average score is: " + averageScore);
    }

    // gets the number of student who score more than 90.
    public long filterScore() {
        return Arrays.stream(scoreInfos)
                .filter(s -> s.getScore() >= 90)    // Filters the score greater than or equal to 90.
                .count();                           // Counts the elements.
    }

    // Gets a new Array of students who failed
    private String[] getFailedStudents() {
        return Arrays.stream(scoreInfos)
                .filter(s -> s.getScore() < 60)            // Filters the score snaller than or equal to 60.
                .map(s -> "ID:" + s.getStudent().getId() + " | "
                        + s.getStudent().getName() + " "
                        + s.getStudent().getLastName() + ": "
                        + s.getScore())
                .toArray(String[]::new);                   // Maps the details to a new string array.
    }

    // Prints the students who failed.
    public void printFailingStudents() {
        Arrays.stream(getFailedStudents())
                .forEach(System.out::println);             // Prints the failed students with the helap of getFailedStidents stream
    }

    // Sorts the students according to their Last name.
    public void getDataSortedByLastName() {
        Arrays.stream(scoreInfos)
                .sorted(Comparator.comparing(s -> s.getStudent().getLastName()))    // Sorts the details according to last name.
                .forEach(s -> System.out.println("ID: " + s.getStudent().getId() + " | "
                        + s.getStudent().getLastName() + " " + s.getStudent().getName()
                        + ": " + s.getScore()));
    }

    // Sorts the students according to the increasing order of their score
    public void getDataSortedByScore() {
        Arrays.stream(scoreInfos)
                .sorted(Comparator.comparingInt(ScoreInfo::getScore).reversed())   // Sorts the details according to decreasing score.
                .forEach(s -> System.out.println("ID: " + s.getStudent().getId() + " | "
                        + s.getStudent().getName() + " " + s.getStudent().getLastName()
                        + " :" + s.getScore()));
    }

}
