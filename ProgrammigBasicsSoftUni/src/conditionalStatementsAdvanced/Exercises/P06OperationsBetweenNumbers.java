package conditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        //Събиране(+), Изваждане(-), Умножение(*), //Деление(/) и Модулно деление(%).
        if (operator.equals("+")) {
            result = n1 + n2;
        } else if (operator.equals("-")) {
            result = n1 - n2;
        } else if (operator.equals("*")) {
            result = n1 * n2;
        } else if (operator.equals("/")) {
            result = (n1*1.0) / n2;
        } else if (operator.equals("%")) {
            result = (n1*1.0) % n2;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, result);
            }
        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
            }
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
            }
        }
    }
}
