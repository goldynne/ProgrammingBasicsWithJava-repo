package conditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());
        Double studioPrice = 0.0;
        Double apartmentPrice = 0.0;
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50.0;
                apartmentPrice = 65.0;
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                break;
            case "July":
            case "August":
                studioPrice = 76.0;
                apartmentPrice = 77.0;
                break;
        }
        if (month.equals("May") || month.equals("October")) {
            if (numberNights > 7 && numberNights <= 14) {
                studioPrice *= 0.95;
            } else if (numberNights > 14) {
                studioPrice *= 0.70;
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (numberNights > 14) {
                studioPrice *= 0.80;
            }
        }
        if (numberNights > 14) {
            apartmentPrice *= 0.90;
        }
        Double studioFinalPrice = numberNights * studioPrice;
        Double apartmentFinalPrice = numberNights * apartmentPrice;
        System.out.printf("Apartment: %.2f lv.", apartmentFinalPrice);
        System.out.printf("\nStudio: %.2f lv.", studioFinalPrice);
    }
}
