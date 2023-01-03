package conditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;
        int finalHours = (examTime - arriveTime) / 60;
        int finalMinutes = (examTime - arriveTime) % 60;

        if (examTime - arriveTime == 0) {
            System.out.println("On time");
        } else if ((examTime - arriveTime <= 30) && (examTime - arriveTime > 0)) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", examTime - arriveTime);
        } else if (examTime - arriveTime > 30) {
            if (examTime - arriveTime <= 59) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", examTime - arriveTime);
            } else if (examTime - arriveTime > 59) {
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", finalHours, finalMinutes);
            }
        } else if ((examTime - arriveTime < 0)) {
            if (arriveTime - examTime <= 59) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", arriveTime - examTime);
            } else if (arriveTime - examTime > 59) {
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", -(finalHours), -(finalMinutes));
            }


        }
    }
}

