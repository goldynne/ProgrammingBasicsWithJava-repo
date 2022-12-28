package conditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        if
        (flowers.equals("Roses") || flowers.equals("Dahlias") || flowers.equals("Tulips") || flowers.equals("Narcissus") || flowers.equals("Gladiolus")) {
            switch (flowers) {
                case "Roses":
                    price = 5;
                    break;
                case "Dahlias":
                    price = 3.80;
                    break;
                case "Tulips":
                    price = 2.80;
                    break;
                case "Narcissus":
                    price = 3;
                    break;
                case "Gladiolus":
                    price = 2.50;
                    break;
            }
            double finalPrice = numberFlowers * price;
            if (numberFlowers >= 10 && numberFlowers <= 1000 && budget >= 50 && budget <= 2500) {
                if (numberFlowers > 80) {
                    if (flowers.equals("Roses")) {
                        finalPrice = finalPrice * 0.90;
                    } else if (flowers.equals("Tulips") || (flowers.equals("Dahlias") && numberFlowers > 90)) {
                        finalPrice = finalPrice * 0.85;
                    }
                }
                if (numberFlowers < 120 && flowers.equals("Narcissus")) {
                    finalPrice = finalPrice * 1.15;
                }
                if (numberFlowers < 80 && flowers.equals("Gladiolus")) {
                    finalPrice = finalPrice * 1.20;
                }
                double levaLeft = budget - finalPrice;
                if (levaLeft >= 0) {
                    System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", numberFlowers, flowers, levaLeft);
                } else if (levaLeft < 0) {
                    levaLeft = -1 * levaLeft;
                    System.out.printf("Not enough money, you need %.2f leva more.", levaLeft);
                }
            }
        }
    }
}
