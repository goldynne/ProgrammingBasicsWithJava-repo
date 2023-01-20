package forLoop.Lab;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i <= n; i+=2) {
            double square = Math.pow (2, i);
            System.out.printf("\n%.0f", square);
        }
    }
}
