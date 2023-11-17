package be.intecbrussel.StudentInfo;

public class ScoreInfoApp {
    public static void main(String[] args) {

        ScoreInfoService scoreInfoService = new ScoreInfoService();       // Initialised scoreInfoService. It has all the methods.

        // Displays the students details with ID.
        System.out.println("********** Student Score List **********");
        scoreInfoService.getStudents();
        System.out.println();

        // Displays total number os students
        System.out.println("Total number of Students: " + scoreInfoService.getNumberOfStudents());
        System.out.println();

        // Displays the average score.
        scoreInfoService.calculateAverageScore();
        System.out.println();

        // Prints total number od students with score more than 90 or equal to 90.
        System.out.println("Number of Students with A: " + scoreInfoService.filterScore());
        System.out.println();

        // Prints all the stidents who failed.
        System.out.println("********** Failed Students **********");
        scoreInfoService.printFailingStudents();
        System.out.println();

        // Sorts the name of students by Last name.
        System.out.println("********** Data Sorted by Last Name **********");
        scoreInfoService.getDataSortedByLastName();
        System.out.println();

        // Sorts the students according to the increasing score.
        System.out.println("********** Data Sorted by Score **********");
        scoreInfoService.getDataSortedByScore();

    }
}
