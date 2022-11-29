package conditionalStatements.Exercises;

import java.util.Scanner;

public class P05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesPlus15 = minutes + 15;
        int newHour = 0;
        if (minutesPlus15 > 59) {
            newHour = hour + 1;
        } else {
            newHour = hour;
        }
        if (minutesPlus15 > 59) {
            minutesPlus15 = minutesPlus15 - 60;
        }
        if (newHour > 23) {
            newHour = 0;
        }
        System.out.printf("%d:%02d",newHour,minutesPlus15);

    }
}
