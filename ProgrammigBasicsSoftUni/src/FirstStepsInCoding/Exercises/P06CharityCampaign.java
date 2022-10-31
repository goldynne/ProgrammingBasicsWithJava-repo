package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int overallDays = Integer.parseInt(scanner.nextLine());
        int chefsNumber = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;
        double overallCakesPrice = cakes*cakePrice;
        double overallWafflesPrice = waffles*wafflePrice;
        double overallPancakesPrice = pancakes*pancakePrice;
        double finalSumWithoutExpenses = overallDays*(chefsNumber*(overallCakesPrice+overallWafflesPrice+overallPancakesPrice));
        double finalSum = finalSumWithoutExpenses-(finalSumWithoutExpenses/8);
        System.out.printf("%.2f",finalSum);

    }
}
