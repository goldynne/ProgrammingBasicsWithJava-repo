package FirstStepsInCoding.Exercises;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class P08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentOtherStuff = Double.parseDouble(scanner.nextLine());
        double lengthDM = length/10.0;
        double widthDM = width/10.0;
        double heightDM = height/10.0;
        double V = lengthDM * widthDM * heightDM;

        double necessaryLitres = V - (V*(percentOtherStuff/100));
        System.out.printf("%.2f", necessaryLitres);
    }
}
