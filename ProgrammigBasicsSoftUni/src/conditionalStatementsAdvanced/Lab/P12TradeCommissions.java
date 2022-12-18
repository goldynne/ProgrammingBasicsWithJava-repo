package conditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        Double s = Double.parseDouble(scanner.nextLine());
        Double commission = 0.0;
        boolean isValid = (town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv"));
        if (town.equals("Sofia")) {
            if (s >= 0 && s <= 500) {
                commission = s * 0.05;
            } else if (s > 500 && s <= 1000) {
                commission = s * 0.07;
            } else if (s > 1000 && s <= 10000) {
                commission = s * 0.08;
            } else if (s > 10000) {
                commission = s * 0.12;

            }
        } else if (town.equals("Varna")) {
            if (s >= 0 && s <= 500) {
                commission = s * 0.045;
            } else if (s > 500 && s <= 1000) {
                commission = s * 0.075;
            } else if (s > 1000 && s <= 10000) {
                commission = s * 0.10;
            } else if (s > 10000) {
                commission = s * 0.13;

            }
        } else if (town.equals("Plovdiv")) {
            if (s >= 0 && s <= 500) {
                commission = s * 0.055;
            } else if (s > 500 && s <= 1000) {
                commission = s * 0.08;
            } else if (s > 1000 && s <= 10000) {
                commission = s * 0.12;
            } else if (s > 10000) {
                commission = s * 0.145;
            }


        }
        if (!isValid || !((s >= 0 && s <= 500) || (s > 500 && s <= 1000) || (s > 1000 && s <= 10000) || (s > 10000))) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);


        }
    }
}
