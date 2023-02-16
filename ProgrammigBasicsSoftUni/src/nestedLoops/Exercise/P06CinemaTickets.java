package nestedLoops.Exercise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (!input.equals("Finish")) {
            int overallFreePlaces = Integer.parseInt(scanner.nextLine());
            int overallTicketsMovie = 0;
            String typeTicket = scanner.nextLine();
            while (!typeTicket.equals("End")) {
                totalTickets += 1;
                switch (typeTicket) {
                    case "student":
                        studentTickets += 1;
                        break;
                    case "standard":
                        standardTickets += 1;
                        break;
                    case "kid":
                        kidTickets += 1;
                        break;
                }
                overallTicketsMovie += 1;
                if (overallTicketsMovie == overallFreePlaces) {
                    break;
                }

                typeTicket = scanner.nextLine();
            }


            System.out.printf("%s - %.2f%% full.\n", input, ((1.0 * overallTicketsMovie / overallFreePlaces) * (100)));
            input = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", ((1.0 * studentTickets / totalTickets) * (100)));
        System.out.printf("%.2f%% standard tickets.\n", ((1.0 * standardTickets / totalTickets) * (100)));
        System.out.printf("%.2f%% kids tickets.\n", ((1.0 * kidTickets / totalTickets) * (100)));
    }
}
