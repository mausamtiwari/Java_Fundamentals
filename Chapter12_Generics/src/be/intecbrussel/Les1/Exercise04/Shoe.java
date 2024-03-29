package be.intecbrussel.Les1.Exercise04;

public class Shoe extends ShoePair{
    private int size;
    private String color;

    public Shoe(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoe{" + "size=" + size + ", color='" + color + '\'' + '}';
    }
}
