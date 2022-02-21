package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Subaru XV");
        car1.setColor("Green");
        car1.setYearOfIssue(2013);

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYearOfIssue());

    }
}
