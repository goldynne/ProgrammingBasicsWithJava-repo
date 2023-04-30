package whileLoop.Lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int n = Integer.parseInt(input);
            if (n < minNumber) {
                minNumber = n;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}