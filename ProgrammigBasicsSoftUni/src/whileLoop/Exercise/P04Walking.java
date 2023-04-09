package whileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int overallSteps = 0;
        while (overallSteps < 10000) {
            input = scanner.nextLine();
            if (input.equals("Going home")) {
                input = scanner.nextLine();
                overallSteps += Integer.parseInt(input);
                break;
            }
            overallSteps += Integer.parseInt(input);
        }
        if (overallSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", overallSteps - 10000);

        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - overallSteps);

        }
    }
}
