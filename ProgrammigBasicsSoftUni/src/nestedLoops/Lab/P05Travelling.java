package nestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < minimalBudget) {
                double savings = Double.parseDouble(scanner.nextLine());
                sum += savings;

            }
            System.out.printf("Going to %s!\n", input);
            input = scanner.nextLine();

        }
    }
}
