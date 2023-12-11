package be.intecbrussel.Oefeningen;

public class Pair<E, T> {
    E value1;
    T value2;

    public Pair(E value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public E getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "(" + value1 + "," + value2 + ")";
    }
}
