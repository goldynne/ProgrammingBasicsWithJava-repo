package whileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumNumbers = 0;
        while (sumNumbers<number){
            int newNumber = Integer.parseInt(scanner.nextLine());
            sumNumbers+=newNumber;

        }
        System.out.println(sumNumbers);

    }
}
