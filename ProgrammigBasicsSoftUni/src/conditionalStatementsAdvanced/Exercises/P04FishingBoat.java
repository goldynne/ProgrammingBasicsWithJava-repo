package conditionalStatementsAdvanced.Exercises;

import java.time.temporal.IsoFields;
import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double seasonPrice = 0.0;
        switch (season) {
            case "Spring":
                seasonPrice = 3000;
                break;
            case "Summer":
                seasonPrice = 4200;
                break;
            case "Autumn":
                seasonPrice = 4200;
                break;
            case "Winter":
                seasonPrice = 2600;
                break;
        }
        if (fishermen <= 6) {
            seasonPrice *=0.9;
        } else if (fishermen <= 11) {
            seasonPrice *=0.85;
        } else {
            seasonPrice *= 0.75;
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            seasonPrice *= 0.95;
        }
        if (budget - seasonPrice >=0) {
            System.out.printf("Yes! You have %.2f leva left.", budget - seasonPrice);
        } else if (budget - seasonPrice <0 ) {
            System.out.printf("Not enough money! You need %.2f leva.", seasonPrice - budget);
        }
    }
}
