package be.intecburssel.Les1;

public class FinalExample {
    // final variable, direct intialize
    final int THRESHOLD = 5;

    // a final static variable PI, direct initialize
    static final double PI = 3.141592653589793;

    // Blank final variable
    final int CAPACITY;

    // Blank final variable
    final static int DAYS_OF_THE_WEEK;

    // Blank final variable
    final int MINIMUM;

    // instance initalizer block
    {
        CAPACITY = 25;
    }

    // Static initializer block
    static {
        DAYS_OF_THE_WEEK = 7;
    }

    /* Constructor for initializing MINIMUM. Note that if there are more than one constructor, you must initialize
       MINIMUM in them also */
    public FinalExample() {
        MINIMUM = -1;
    }
}
