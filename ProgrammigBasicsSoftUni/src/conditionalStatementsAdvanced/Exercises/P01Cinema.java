package conditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int places = r * c;
        double price = 0.0;
        switch (projection) {
            case "Premiere":
                price = places * 12.00;
                break;
            case "Normal":
                price = places * 7.50;
                break;
            case "Discount":
                price = places * 5.00;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
