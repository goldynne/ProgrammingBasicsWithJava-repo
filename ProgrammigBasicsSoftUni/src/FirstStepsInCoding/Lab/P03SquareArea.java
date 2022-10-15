package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P03SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"2"
        String input = scanner.nextLine();
        int a = Integer.parseInt(input);

        int squareArea = a * a;

        System.out.println(squareArea);
    }
}
