package day9.Task2;

/*Реализация первого метода должна возвращать площадь фигуры,
а реализация второго метода должна возвращать периметр фигуры.*/

public class Circle extends Figure {

    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

}
