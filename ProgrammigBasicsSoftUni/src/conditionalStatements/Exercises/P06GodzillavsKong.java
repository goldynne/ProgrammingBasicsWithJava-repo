package conditionalStatements.Exercises;

import java.util.Scanner;

public class P06GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        Double clothingPrice = Double.parseDouble(scanner.nextLine());
        Double decor = budget * 0.10;
        if (statists > 150) {
            clothingPrice *= 0.90;
        }
        Double finalClothingPrice = clothingPrice * statists;
        Double finalSum = finalClothingPrice + decor;
        if (finalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", finalSum - budget);
        } else if (finalSum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - finalSum);
        }

    }
}
