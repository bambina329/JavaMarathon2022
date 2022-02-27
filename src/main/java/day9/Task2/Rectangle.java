package day9.Task2;

/*Реализация первого метода должна возвращать площадь фигуры,
а реализация второго метода должна возвращать периметр фигуры.*/

public class Rectangle extends Figure {

    double width;
    double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return width + width + height + height;
    }
}
