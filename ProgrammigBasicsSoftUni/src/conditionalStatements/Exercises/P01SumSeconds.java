package conditionalStatements.Exercises;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsFirst = Integer.parseInt(scanner.nextLine());
        int secondsSecond = Integer.parseInt(scanner.nextLine());
        int secondsThird = Integer.parseInt(scanner.nextLine());
        int overallSeconds = secondsFirst + secondsSecond + secondsThird;
        int minutes = overallSeconds/60;
        int remainingSeconds = overallSeconds%60;
        System.out.printf(minutes + ":" + "%02d",remainingSeconds);

    }
}
