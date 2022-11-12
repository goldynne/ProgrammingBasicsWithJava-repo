package conditionalStatements.Lab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        if (score>=5) {
            System.out.println("Excellent!");
        }
    }
}
