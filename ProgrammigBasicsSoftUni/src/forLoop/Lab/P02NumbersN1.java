package forLoop.Lab;

import java.util.Scanner;

public class P02NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = number; i>=1; i-=1 ) {
            System.out.println(i);
        }
    }
}
