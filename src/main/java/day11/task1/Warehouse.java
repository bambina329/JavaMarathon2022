package day11.task1;


/*“Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов),
         (количество доставленных заказов),
        get методами для обоих полей и методом toString() для получения информации о значениях полей склада.*/

public class Warehouse {
     private int countPickedOrders;
     private int countDeliveredOrders;

    public String toString() {
        return "Количество собранных заказов плата: " + countPickedOrders + " количество доставленных заказов " + countDeliveredOrders;
    }
    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {  // по видео метод инкримента
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
}
