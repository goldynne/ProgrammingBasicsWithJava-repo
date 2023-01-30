package forLoop.Lab;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        Double overallMoney = 0.0;
        int overallToys = 0;
        int overallPriceToys;

        for (int i = 1; i <= n; i = i + 1) {
            if (i % 2 == 1) {
                overallToys = overallToys + 1;

            }
            if (i % 2 == 0) {
                overallMoney = overallMoney + (((i * 10.00) / 2) - 1);
            }
        }
        overallPriceToys = priceToy * overallToys;
        Double overall = overallMoney + overallPriceToys;
        if (overall >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", overall - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - overall);
        }
    }
}
