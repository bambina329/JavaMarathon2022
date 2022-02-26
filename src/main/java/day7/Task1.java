package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boing1 = new Airplane("Boing", 2002, 10, 10000);
        Airplane airbas = new Airplane("Airbas", 2005, 10, 8000);

        Airplane.compareAirplanes(boing1, airbas);
    }
}