package forLoop.Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case 'a':
                    n = n + 1;
                    break;
                case 'e':
                    n = n + 2;
                    break;
                case 'i':
                    n = n + 3;
                    break;
                case 'o':
                    n = n + 4;
                    break;
                case 'u':
                    n = n + 5;
                    break;
            }
        }
        System.out.println(n);
    }
}

