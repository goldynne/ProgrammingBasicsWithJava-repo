package preliminaryOnlineExam;

import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seaExcursions = Integer.parseInt(scanner.nextLine());
        int mountainExcursions = Integer.parseInt(scanner.nextLine());
        int seaPrice = 680;
        int mountainPrice = 499;
        int profit = 0;
        boolean soldOut = false;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            if (input.equals("sea")) {
                if (seaExcursions > 0) {
                    profit = profit + seaPrice;
                    seaExcursions--;
                }
            } else if (input.equals("mountain")) {
                if (mountainExcursions > 0) {
                    profit += mountainPrice;
                    mountainExcursions--;
                }
            }
            if (seaExcursions <= 0 && mountainExcursions <= 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
            input = scanner.nextLine();

        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
