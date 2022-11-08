package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPricePerKG = Double.parseDouble(scanner.nextLine());
        double spratPriceKG = Double.parseDouble(scanner.nextLine());
        double bonitodKG = Double.parseDouble(scanner.nextLine());
        double scadKG = Double.parseDouble(scanner.nextLine());
        int musselsKG = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerelPricePerKG+(mackerelPricePerKG*0.6);
        double scadPrice = spratPriceKG + (spratPriceKG*0.8);
        double musselsPrice = musselsKG*7.5;
        double finalBonitoPrice = bonitodKG*bonitoPrice;
        double finalScadPrice = scadKG*scadPrice;
        double finalSum = finalBonitoPrice+finalScadPrice+musselsPrice;
//        double finalResult = Math.round(finalSum*100.0)/100.0;
        System.out.printf("%.2f",finalSum);
//        System.out.println(finalSum);
    }
}
