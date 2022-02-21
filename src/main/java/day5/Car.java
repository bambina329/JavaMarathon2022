package day5;
/*

1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.

Создать get и set методы для каждого поля.

Создать экземпляр класса Автомобиль.


Задать значение для каждого поля, используя set методы.

Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
*/

public class Car {
    private String model;
    private String color;
    private int yearOfIssue;

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

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue < 0) {
            System.out.println("Необходимо указать год выпуска автомобиля");
        } else {
            this.yearOfIssue = yearOfIssue;
        }
    }
}