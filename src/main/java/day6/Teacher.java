package day6;

/*
внутри метода случайным образом генерируется число от 2 до 5, затем в консоль выводится строка:
"Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
в зависимости от значения случайно сгенерированного числа.

Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента, передав студента в качестве аргумента метода.*/

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    Random random = new Random();

    public void evaluate(Student s) {           //оценить студента
        int count = 0;
        String value = "";
        count = random.nextInt(4) +2;
        if (count == 2) {
            value = ("неудовлетворительно");
        } else if (count == 3) {
            value = ("удовлетворительно");
        } else if (count == 4) {
            value = ("хорошо");
        } else if (count == 5) {
            value = ("хорошо");
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() + " по предмету " + subject + " на оценку " + value);
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
