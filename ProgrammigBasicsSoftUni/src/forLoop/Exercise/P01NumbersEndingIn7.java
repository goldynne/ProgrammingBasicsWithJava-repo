package forLoop.Exercise;

import java.util.Scanner;

public class P01NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 7; i <= 997; i = i + 1) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}