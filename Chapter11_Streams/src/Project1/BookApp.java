package Project1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class BookApp {
    public static void main(String[] args) {
        Person[] authors = personsArray();      // authors array of Type Person created by calling personArray method.
        Book[] books = booksArray(authors);     // books array of Type Book which has argument authors created by calling booksArray method.

        System.out.println("Newest Book: " + getNewestBook(books));
        System.out.println();
        printYoungestWriter(books);
        System.out.println();
        System.out.println("The books sorted by title: ");
        printSortedByTitle(books);
        System.out.println();
        System.out.println("The number of boooks per author is: ");
        countBooksPerAuthor(books);
        System.out.println();
        System.out.print("The book released in 2016 is: ");
        printBooksReleasedIn2016(books);


    }


    private static Person[] personsArray() {    // Method personsArray returns an array of type Person.
        return new Person[]{
                new Person("Hector", "Garcia", LocalDate.of(1984, 11, 17)),
                new Person("James", "Clear", LocalDate.of(1986, 1, 22)),
                new Person("Nita", "Prose", LocalDate.of(1972, 9, 30)),
                new Person("Robin", "Sharma", LocalDate.of(1964, 6, 16)),
                new Person("Paulo", "Coelho", LocalDate.of(1947, 8, 24)),
        };
    }

    private static Book[] booksArray(Person[] authors) {  // Method booksArray returns an array of type Book.
        return new Book[]{
                new Book("Ikigai", authors[0], LocalDate.of(2017, 8, 29), "self-help"),
                new Book("Atomic Habits", authors[1], LocalDate.of(2016, 5, 29), "self-help"),
                new Book("The Maid", authors[2], LocalDate.of(2020, 7, 3), "self-help"),
                new Book("The 5AM Club", authors[3], LocalDate.of(2018, 12, 4), "self-help"),
                new Book("The Alchemist", authors[4], LocalDate.of(1988, 3, 7), "self-help"),
        };
    }

    public static Book getNewestBook(Book[] books) {   // Returns latest release date.
        return Arrays.stream(books)                    // Converts array of Book object into stream.
                .max(Comparator.comparing(Book::getReleaseDate)) // Compares release dates inside Book[] and returns the latest release date.
                .get();                                // Retrieves the result.

    }

    public static void printYoungestWriter(Book[] books) {
        Person youngestAuthor = Arrays.stream(books)     // Converts array of Book object into stream.
                .map(Book::getAuthor)   // Maps each Book to its author. Book class has a getAuthor method.
                .max(Comparator.comparing(Person::getDateOfBirth)) // Finds the latest birthdate using getDateOfBirth mehtod from Person class.
                .get();                 // Retrieves the result
        System.out.println("The youngest author is: " + youngestAuthor.getFirstName() + " " + youngestAuthor.getLastName());
    }

    public static void printSortedByTitle(Book[] books) {
        Arrays.stream(books)                                     // Converts array of Book object into stream.
                .sorted(Comparator.comparing(Book::getTitle))    // Sorts the book according the name using getTitle method from Book class.
                .forEach(book -> System.out.println(book.getTitle()));  // Prints each book
    }

    public static void countBooksPerAuthor(Book[] books) {
        Arrays.stream(books)       // Converts array of Book object into stream.
                //  Using groupingBY method of collector class, the name of author is collected and occurance of author is counted.
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()))
                // Prints the firstname and lastname of author and the number of books s/he has written.
                .forEach((author, count) -> System.out.println(author.getFirstName() + " " + author.getLastName() + ": " + count));
    }

    public static void printBooksReleasedIn2016(Book[] books) {
        Arrays.stream(books)                    // Converts array of Book object into stream.
                .filter(book -> book.getReleaseDate().getYear() == 2016)  // Filters the book having release date 2016.
                .forEach(book -> System.out.println(book.getTitle()));    // Prints the books.
    }

}
