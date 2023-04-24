package whileLoop.Lab;

import java.util.Scanner;

public class P04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nextNum = 1;
        while (nextNum <=n) {
            System.out.println(nextNum);
            nextNum = nextNum*2 + 1;
        }
    }
}
