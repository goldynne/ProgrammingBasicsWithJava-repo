package forLoop.Exercise;

import java.util.Scanner;

public class P03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Double sumOdd = 0.0;
        Double minOdd = Double.POSITIVE_INFINITY;
        Double maxOdd = Double.NEGATIVE_INFINITY;
        Double sumEven = 0.0;
        Double minEven = Double.POSITIVE_INFINITY;
        Double maxEven = Double.NEGATIVE_INFINITY;
        for (int i = 1; i <= n; i++) {
            Double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += num;
                if (num < minEven) {
                    minEven = num;
                }
                if (num > maxEven) {
                    maxEven = num;
                }

            } else {
                sumOdd += num;
                if (num < minOdd) {
                    minOdd = num;
                }
                if (num > maxOdd) {
                    maxOdd = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n", sumOdd);
        if (sumOdd == 0.00) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,\n", minOdd);
            System.out.printf("OddMax=%.2f,\n", maxOdd);
        }
        System.out.printf("EvenSum=%.2f,\n", sumEven);
        if (sumEven == 0.00) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,\n", minEven);
            System.out.printf("EvenMax=%.2f", maxEven);

        }
    }
}
