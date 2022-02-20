package day2;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        double x2 = 0;

        if (x >= 5) {
            x2 = pow (x,2);
            y = (x2- 10)/(x + 7);
            System.out.println(y);
        }

        else if (x > -3 && x < 5) {
            x2 = pow (x,2);
            y = (x + 3) * (x2 - 2);
            System.out.println(y);

        }
        else if (x <= - 3) {
            y = 420;
            System.out.println(y);
        }

    }
}
