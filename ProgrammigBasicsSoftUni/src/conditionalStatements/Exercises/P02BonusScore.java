package conditionalStatements.Exercises;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Double bonus = 0.0;
        if (number <=100) {
            bonus = 5.0;
        } else if (number > 1000) {
            bonus = number *0.1;
        } else {
            bonus = number * 0.2;
        }

        Double secondBonus = 0.0;
        if (number % 2 == 0) {
            secondBonus = secondBonus + 1;
        } else if (number % 10 == 5) {
            secondBonus = secondBonus + 2;
        }
        Double finalBonus = bonus + secondBonus;
        Double numberPlusBonus = number + finalBonus;
        System.out.println(finalBonus);
        System.out.println(numberPlusBonus);
    }
}
