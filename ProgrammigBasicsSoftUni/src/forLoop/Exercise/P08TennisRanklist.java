package forLoop.Exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTournaments = Integer.parseInt(scanner.nextLine());
        int entrancePoints = Integer.parseInt(scanner.nextLine());
        int w = 0;
        int f = 0;
        int sf = 0;
        int numberWonTournaments = 0;
        for (int i = 0; i < numberTournaments; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    w += 2000;
                    numberWonTournaments += 1;
                    break;
                case "F":
                    f += 1200;
                    break;
                case "SF":
                    sf += 720;
            }

        }
        int finalResult = entrancePoints + w + f + sf;
        Double averagePoints = Math.floor(1.0 * (w + f + sf) / numberTournaments);
        Double percentWonTournaments = (1.0 * numberWonTournaments / numberTournaments) * 100;
        System.out.printf("Final points: %d", finalResult);
        System.out.printf("\nAverage points: %.0f", averagePoints);
        System.out.printf("\n%.2f%%", percentWonTournaments);
    }
}
