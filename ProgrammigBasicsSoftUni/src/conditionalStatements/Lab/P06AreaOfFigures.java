package conditionalStatements.Lab;

import java.util.Scanner;

public class P06AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String square = "square";
        String rectangle = "rectangle";
        String circle = "circle";
        String triangle = "triangle";

        Double area = 0.0;
        if (type.equals(square)) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a*a;
        } else if (type.equals(rectangle)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a*b;
        } else if (type.equals(circle)) {
            Double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI*r*r;
        } else if (type.equals(triangle)) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double h = Double.parseDouble(scanner.nextLine());
            area = (a*h)/2;
        }
        System.out.printf("%.3f", area);


    }
}
