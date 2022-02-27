package day9.Task2;

/*Реализация первого метода должна возвращать площадь фигуры,
а реализация второго метода должна возвращать периметр фигуры.*/


public class Triangle extends Figure {

    double length1;
    double length2;
    double length3;

    public Triangle(double length1, double length2, double length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;

    }

    @Override
    public double area() {
        double p = (length1 + length2 + length3) / 2.0;
        return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
