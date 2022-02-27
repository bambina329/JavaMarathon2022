package day9.Task2;

public abstract class Figure {
    String color;

    public abstract double area();

    public abstract double perimeter();

    public String getColor() {
        return color;
    }

    public Figure(String color) {
        this.color = color;
    }
}
