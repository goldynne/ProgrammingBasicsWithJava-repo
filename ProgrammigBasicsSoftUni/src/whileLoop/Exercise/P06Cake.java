package whileLoop.Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int overallNumberCakes = (width * length);
        String input = scanner.nextLine();
        int takenCakes = 0;
        boolean cakeOver = false;
        while (!input.equals("STOP")) {
            takenCakes += Integer.parseInt(input);
            if (takenCakes > overallNumberCakes) {
                cakeOver = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (cakeOver) {
            System.out.printf("No more cake left! You need %d pieces more.", takenCakes - overallNumberCakes);
        } else {
            System.out.printf("%d pieces are left.", overallNumberCakes - takenCakes);
        }
    }
}
