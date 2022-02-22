package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        int differenceCar = car1.yearDifference(2000);
        System.out.println(differenceCar);

        Motorbike moto1 = new Motorbike("BMW", "black", 2002);
        int differenceMoto = moto1.yearDifference(2005);
        System.out.println(differenceMoto);
    }
}