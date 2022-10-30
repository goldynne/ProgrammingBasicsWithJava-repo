package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallPrice = Integer.parseInt(scanner.nextLine());
        double cakePrice = hallPrice*0.2;
        double drinks = cakePrice - (cakePrice*0.45);
        double animatorPrice = hallPrice/3.0;
        double finalPrice = hallPrice + cakePrice + drinks + animatorPrice;
        System.out.println(finalPrice);
    }
}
