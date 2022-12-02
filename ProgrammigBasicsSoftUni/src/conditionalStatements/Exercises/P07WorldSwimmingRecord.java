package conditionalStatements.Exercises;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double recordSeconds = Double.parseDouble(scanner.nextLine());
        Double metres = Double.parseDouble(scanner.nextLine());
        Double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        Double time = metres*secondsPerMeter;
        Double delayTimes = Math.floor(metres /15);
        Double delay = delayTimes * 12.5;
        Double overallTime = time + delay;
        Double difference = overallTime - recordSeconds;
        if (difference < 0) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", overallTime);
        } if (difference >= 0) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
