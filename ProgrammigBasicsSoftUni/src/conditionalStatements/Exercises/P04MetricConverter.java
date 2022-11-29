package conditionalStatements.Exercises;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double number = Double.parseDouble(scanner.nextLine());
        String unit = scanner.nextLine();
        String endUnit = scanner.nextLine();
        Double mm = 0.0;
        if (unit.equals("m")) {
            mm = number * 1000;
        } else if (unit.equals("cm")) {
            mm = number * 10;
        } else if (unit.equals("mm")) {
            mm = number;
        }
        Double endNumber = 0.0;
        if (endUnit.equals("m")) {
            endNumber = mm / 1000;
        } else if (endUnit.equals("cm")) {
            endNumber = mm / 10;
        } else if (endUnit.equals("mm")) {
            endNumber = mm;
        }
        System.out.printf("%.3f", endNumber);


    }
}
