package conditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double price = 0;
        String type = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                type = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                type = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                type = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                type = "Hotel";
            }
        }else {
            destination = "Europe";
            price = budget*0.90;
            type = "Hotel";
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.printf("\n%s - %.2f", type, price);
    }
}
