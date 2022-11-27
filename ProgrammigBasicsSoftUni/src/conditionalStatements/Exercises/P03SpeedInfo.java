package conditionalStatements.Exercises;

import java.util.Scanner;

public class P03SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double speed = Double.parseDouble(scanner.nextLine());
        if (speed > 1000) {
            System.out.println("extremely fast");
        } else if (speed > 150 ) {
            System.out.println("ultra fast");
        } else if (speed > 50) {
            System.out.println("fast");
        } else if (speed > 10) {
            System.out.println("average");
        } else {
            System.out.println("slow");
        }

    }
}
