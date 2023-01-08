package forLoop.Exercise;

import java.util.Scanner;

public class P06FootballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int footballMatches = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int wins = 0;
        int draws = 0;
        int losses = 0;
        for (int i = 0; i < footballMatches; i++) {
            String matchResult = scanner.nextLine();
            switch (matchResult) {
                case "W":
                    points += 3;
                    wins++;
                    break;
                case "D":
                    points += 1;
                    draws++;
                    break;
                case "L":
                    losses++;
                    break;
            }

        }
        if (footballMatches == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            System.out.printf("%s has won %d points during this season.\n", name, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n", wins);
            System.out.printf("## D: %d\n", draws);
            System.out.printf("## L: %d\n", losses);
            System.out.printf("Win rate: %.2f%%", (1.0*wins/footballMatches)*100);
        }
    }
}
