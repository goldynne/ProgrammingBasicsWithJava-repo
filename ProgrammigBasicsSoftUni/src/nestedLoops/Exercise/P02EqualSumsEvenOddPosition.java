package nestedLoops.Exercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallerNumber = Integer.parseInt(scanner.nextLine());
        int biggerNumber = Integer.parseInt(scanner.nextLine());

        for (int i = smallerNumber; i <= biggerNumber ; i++) {
            String currentNum = "" + i;
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" +currentNum.charAt(j));
                if (j%2 == 0) {
                    sumEven +=currentDigit;
                }else{
                    sumOdd += currentDigit;
                }

            }
            if (sumEven == sumOdd){
                System.out.print(i + " ");
            }


        }
    }
}
