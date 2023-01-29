package forLoop.Lab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = n; i > 0; i = i - 1) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + number;
            }
            if (i % 2 == 1) {
                sumOdd = sumOdd + number;
            }

        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes\nSum = %d", sumEven);
        }
        if (sumEven != sumOdd) {
            System.out.printf("No\nDiff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
