package conditionalStatements.Lab;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int speakingDolls = Integer.parseInt(scanner.nextLine());
        int fluffyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.6;
        double speakingDollPrice = 3;
        double fluffyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        int orderedToys =  puzzles + speakingDolls + fluffyBears + minions + trucks;
        double finalPrice = (puzzlePrice * puzzles) + (speakingDollPrice * speakingDolls) + (fluffyBearPrice * fluffyBears) + (minionPrice * minions) + (truckPrice * trucks);

        if (orderedToys >= 50) {
            finalPrice = finalPrice - (finalPrice * 0.25);
        }

        double finalPriceWithoutRent = finalPrice - (finalPrice*0.1);

        double difference = Math.abs(finalPriceWithoutRent - priceTrip);

        if (finalPriceWithoutRent >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }


    }
}
