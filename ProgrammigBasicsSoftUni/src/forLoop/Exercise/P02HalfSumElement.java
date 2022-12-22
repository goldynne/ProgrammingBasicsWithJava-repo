package forLoop.Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i = i + 1) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (num > max) {
                max = num;
            }
        }
        int sumWithoutMax = sum - max;
        if (max == sumWithoutMax) {
            System.out.printf("Yes\nSum = %d", sumWithoutMax);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(max - sumWithoutMax));
        }
    }
}
