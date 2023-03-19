package preliminaryOnlineExam;

import java.util.Scanner;

public class P02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pocketMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double overallExpenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double overallMoney = (profitPerDay * 5.00) + (pocketMoneyPerDay * 5.00);
        double moneyLeft = overallMoney - overallExpenses;
        if (moneyLeft > giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", moneyLeft);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - moneyLeft);
        }
    }
}
