package examPreparation;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double sumNights = nights * pricePerNight;
        double sumExtra = percent *0.01 * budget;
        double expenses = sumNights + sumExtra;
        if (nights >7) {
            pricePerNight -= 0.05*pricePerNight; //0.95*pricePerNight
        }
        if (budget >= expenses) {
            double leftMoney = budget - expenses;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", leftMoney);
        }else {
            double needMoney = expenses - budget;
            System.out.printf("%.2f leva needed.", needMoney);
        }



    }
}
