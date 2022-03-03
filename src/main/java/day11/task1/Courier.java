package day11.task1;

/*“Курьер” (англ. Courier) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
        get методами для обоих полей, методом toString() и конструктором.*/

public class Courier implements Worker {
    private int salary;
    private boolean isPayed = false;
    Warehouse warehouse;


    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
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
        salary = salary + 100;
        int count = warehouse.getCountDeliveredOrders();
        warehouse.setCountDeliveredOrders(count + 1);
        return;
    }

    @Override
    public void bonus() {
        int count = warehouse.getCountDeliveredOrders();
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        } else if (count == 10000) {
            salary = salary + 50000;
            setPayed(true);
            return;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
