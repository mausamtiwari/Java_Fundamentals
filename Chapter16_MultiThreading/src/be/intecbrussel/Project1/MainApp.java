package be.intecbrussel.Project1;

public class MainApp {
    public static void main(String[] args) {
        // Persons created.
        Person Jerry = new Person("Jerry", 70, 5000);

        Person Leo = new Person("Leo", 29, 5200);
        Person John = new Person("John", 49, 5100);
        Person Drake = new Person("Drake", 19, 5300);
        Person Ana = new Person("Ana", 19, 5000);

        // Life started.
        Jerry.startLife();
        Leo.startLife();
        John.startLife();
        Drake.startLife();
        Ana.startLife();

        // Life ended.
        Jerry.endLife();
        Leo.endLife();
        John.endLife();
        Drake.endLife();

    }
}
