package day11.task1;

/*
“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
        get методами для обоих полей, методом toString() и конструктором.*/

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        int count = warehouse.getCountPickedOrders();
        warehouse.setCountPickedOrders(count + 1);
    }

    @Override
    public void bonus() {
        int count = warehouse.getCountPickedOrders();
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else if (count == 10000) {
            salary = salary + 70000;
            //setPayed(true);
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
