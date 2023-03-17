package examPreparation;

import java.util.Scanner;

public class P6VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double overAllSum = 0;
        for (int day = 1; day <= days; day++) {
            double sumPerDay = 0;
            for (int hour = 1; hour <= hoursPerDay; hour++) {

                if (day % 2 == 0 && hour % 2 == 1) {
                    sumPerDay += 2.50;

                } else if (day % 2 == 1 && hour % 2 == 0) {
                    sumPerDay += 1.25;
                } else {
                    sumPerDay += 1;
                }

            }
            overAllSum +=sumPerDay;
            System.out.printf("Day: %d - %.2f leva\n", day, sumPerDay);
        }
        System.out.printf("Total: %.2f leva", overAllSum);
    }
}
