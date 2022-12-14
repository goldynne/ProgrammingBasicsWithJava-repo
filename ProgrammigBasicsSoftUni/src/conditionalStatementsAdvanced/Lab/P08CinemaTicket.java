package conditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
//        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
//            System.out.println(12);
//        } else if (day.equals("Wednesday") || day.equals("Thursday")) {
//            System.out.println(14);
//        } else if (day.equals("Saturday") || day.equals("Sunday")) {
//            System.out.println(16);
//        }
//        }
//    }
        Integer price = 0;
        switch (day) {
            case "Monday":
                price = 12;
                break;
            case "Tuesday":
                price = 12;
                break;
            case "Wednesday":
                price = 14;
                break;
            case "Thursday":
                price = 14;
                break;
            case "Friday":
                price = 12;
                break;
            case "Saturday":
                price = 16;
                break;
            case "Sunday":
                price = 16;
                break;

        }
        System.out.println(price);

    }
}