package FirstStepsInCoding.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKG = Double.parseDouble(scanner.nextLine());
        double orangesKG = Double.parseDouble(scanner.nextLine());
        double raspberriesKG = Double.parseDouble(scanner.nextLine());
        double strawberriesKG = Double.parseDouble(scanner.nextLine());

        double rasperriesPrice = strawberriesPrice*0.5;
        double orangesPrice = rasperriesPrice - rasperriesPrice*0.4;
        double bananasPrice = rasperriesPrice*0.2;

        double bananasFinalPrice = bananasKG*bananasPrice;
        double orangesFinalPrice = orangesKG*orangesPrice;
        double raspberriesFinalPrice = raspberriesKG*rasperriesPrice;
        double strawberriesFinalPrice = strawberriesKG*strawberriesPrice;
        double finalPrice = bananasFinalPrice + orangesFinalPrice + raspberriesFinalPrice + strawberriesFinalPrice;
        System.out.printf("%.2f",finalPrice);





    }
}
