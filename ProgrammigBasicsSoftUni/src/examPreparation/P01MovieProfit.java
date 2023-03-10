package examPreparation;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int ticketsPerDay = Integer.parseInt(scanner.nextLine());
        double pricePerTicket = Double.parseDouble(scanner.nextLine());
        int percentForCinema = Integer.parseInt(scanner.nextLine());

        double sumPerDay = ticketsPerDay * pricePerTicket;
        double totalSum = sumPerDay * days;
        double profitCinema = totalSum * (percentForCinema/100.0);
        double profitStudio = totalSum - profitCinema;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profitStudio);

    }
}
