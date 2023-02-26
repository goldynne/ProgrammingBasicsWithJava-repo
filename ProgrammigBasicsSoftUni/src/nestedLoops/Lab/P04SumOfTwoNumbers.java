package nestedLoops.Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean combination = false;
        int numberCombinations = 0;

        for (int i = beginning; i <= end; i++) {

            for (int j = beginning; j <= end; j++) {
                numberCombinations++;
                if (i + j == magicNumber) {
                    combination = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", numberCombinations, i,j, magicNumber);
                    break;
                }


            }
            if (combination) {
                break;
            }

        }
        if (!combination) {
            System.out.printf("%d combinations - neither equals %d", numberCombinations, magicNumber);
        }
    }
}