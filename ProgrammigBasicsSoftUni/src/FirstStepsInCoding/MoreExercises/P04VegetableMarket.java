package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePriceKG = Double.parseDouble(scanner.nextLine());
        double fruitsPriceKG = Double.parseDouble(scanner.nextLine());
        int vegetableKG = Integer.parseInt(scanner.nextLine());
        int fruitsKG = Integer.parseInt(scanner.nextLine());
        double finalPriceVegetables = vegetablePriceKG*vegetableKG;
        double finalPriceFruits = fruitsPriceKG*fruitsKG;
        double incomeEuro = (finalPriceVegetables+finalPriceFruits) / 1.94;

        System.out.printf("%.2f",incomeEuro);
    }
}
