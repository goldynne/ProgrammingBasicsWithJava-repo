package examPreparation;

import java.util.Scanner;

public class P05TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int countProducts = 0;
        double totalSum = 0;
        while (!command.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            countProducts++;
            if (countProducts % 3 == 0) {
                price = price / 2;
            }
            totalSum += price;
            if (totalSum > budget) {
                System.out.println("You don't have enough money!");
                double needMoney = totalSum - budget;
                System.out.printf("You need %.2f leva!", needMoney);
                break;
            }


            command = scanner.nextLine();
        }
        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", countProducts, totalSum);
        }
    }
}
