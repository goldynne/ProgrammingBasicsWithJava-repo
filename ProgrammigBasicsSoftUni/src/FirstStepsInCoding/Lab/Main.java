package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
      //  String name = scanner.nextLine();
      //  System.out.println(name);

     //   double a = 1.5;
       // double b = 2.5;
        //double sum = a + b;
        //String sumText = "The sum is: " + sum;
        //System.out.println(sumText);

       // int a = 25;
       // int result = a/4;
       // double result2 = a/4.0;

        //System.out.println(result);
       // System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        int squareMetres = Integer.parseInt(scanner.nextLine());
        double price = squareMetres * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %s lv. ", finalPrice);
        System.out.printf("The discount is: %s lv.", discount);









    }
}
