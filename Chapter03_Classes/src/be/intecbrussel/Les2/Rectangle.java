package be.intecbrussel.Les2;

import java.util.Objects;

public class Rectangle {
    private int height;
    private int width;
    private int x;
    private int y;


    public Rectangle() {

    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public Rectangle(Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.x = rectangle.x;
        this.y = rectangle.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? Math.abs(-height) : height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? Math.abs(-width) : width;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void grow(int d) {
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return getHeight() == rectangle.getHeight() && getWidth() == rectangle.getWidth() && getX() == rectangle.getX() && getY() == rectangle.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getX(), getY());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}





