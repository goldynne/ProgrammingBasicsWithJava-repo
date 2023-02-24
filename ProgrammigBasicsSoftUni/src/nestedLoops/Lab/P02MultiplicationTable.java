package nestedLoops.Lab;

import java.util.Scanner;

public class P02MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int x = 1; x <= 10; x++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", x, j, x*j);

            }

        }
    }
}
