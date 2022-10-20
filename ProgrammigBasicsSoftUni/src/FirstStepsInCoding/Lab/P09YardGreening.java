package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardSize = Double.parseDouble(scanner.nextLine());
        double priceGreening = yardSize * 7.61;

        double discount = priceGreening * 0.18;

        double finalPrice = priceGreening - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");

        System.out.println("The discount is: " + discount + " lv.");
    }
}
