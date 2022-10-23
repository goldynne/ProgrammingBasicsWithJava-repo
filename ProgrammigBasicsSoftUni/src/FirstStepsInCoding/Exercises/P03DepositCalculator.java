package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double yearInterest = Double.parseDouble(scanner.nextLine());
        double finalSum = deposit + months * ((deposit * yearInterest/100)/12);
        System.out.println(finalSum);
    }
}
