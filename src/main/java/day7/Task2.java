package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int random1 = random.nextInt(10) + 91;
        int random2 = random.nextInt(10) + 91;
        int random3 = random.nextInt(10) + 91;
        int random4 = random.nextInt(10) + 91;
        int random5 = random.nextInt(10) + 91;
        int random6 = random.nextInt(10) + 91;
        int random7 = random.nextInt(10) + 91;

        Player player1 = new Player(random1);
        Player player2 = new Player(random2);
        Player player3 = new Player(random3);

        Player.info();

        Player player4 = new Player(random4);
        Player player5 = new Player(random5);
        Player player6 = new Player(random6);

        Player.info();

        Player player7 = new Player(random7);

        Player.info();

        for (int i = 0; i < random1; i++) {
            player1.run();
        }
        Player.info();
    }

}

