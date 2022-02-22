package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfIssue;


    /*    public Car(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }*/

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int difference;
        difference=inputYear-yearOfIssue;
        return Math.abs(difference);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Необходимо указать модель автомобиля!");
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Необходимо указать цвет автомобиля ");
        } else {
            this.color = color;
        }
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYear(int yearOfIssue) {
        if (yearOfIssue < 0) {
            System.out.println("Необходимо указать год выпуска автомобиля");
        } else {
            this.yearOfIssue = yearOfIssue;
        }
    }
}