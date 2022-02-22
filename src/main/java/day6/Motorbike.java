package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;

    public void info() {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear) {
        int difference;
        difference=inputYear-yearOfIssue;
        return Math.abs(difference);
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Motorbike(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;

    }
}
