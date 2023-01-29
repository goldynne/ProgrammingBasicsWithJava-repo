package forLoop.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int allNumbers = 2*n;
        int sum1 = 0;
        int sum2 = 0;
        int diff = sum1 - sum2;
        for (int i = allNumbers; i > n; i = i - 1) {
            int number = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + number;
        }
        for (int i2 = n; i2 > 0; i2 = i2 - 1) {
            int number2 = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + number2;
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
