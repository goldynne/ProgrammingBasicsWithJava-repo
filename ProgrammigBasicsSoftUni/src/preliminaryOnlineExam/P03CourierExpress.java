package preliminaryOnlineExam;

import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightKilograms = Double.parseDouble(scanner.nextLine());
        String deliveryType = scanner.nextLine();
        int overallKilometres = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (deliveryType.equals("standard")){
            if(weightKilograms<1){
                price += 0.03*overallKilometres;
            }else if (weightKilograms>=1 && weightKilograms<10){
                price += 0.05*overallKilometres;
            }else if (weightKilograms>=10 && weightKilograms<40){
                price += 0.1*overallKilometres;
            }else if (weightKilograms>=40 && weightKilograms<90){
                price+= 0.15*overallKilometres;
            }else if (weightKilograms>=90 && weightKilograms<150){
                price+=0.2*overallKilometres;
            }
        }if (deliveryType.equals("express")){
            if(weightKilograms<1){
                price += (0.03*overallKilometres) +(0.8*0.03*weightKilograms)*overallKilometres;
            }else if (weightKilograms>=1 && weightKilograms<10){
                price += (0.05*overallKilometres) + (0.4*0.05*weightKilograms)*overallKilometres;
            }else if (weightKilograms>=10 && weightKilograms<40){
                price += (0.1*overallKilometres) +(0.05*0.1*weightKilograms)*overallKilometres;
            }else if (weightKilograms>=40 && weightKilograms<90){
                price+= 0.15*overallKilometres + (0.02*0.15*weightKilograms)*overallKilometres;
            }else if (weightKilograms>=90 && weightKilograms<150){
                price+=0.2*overallKilometres + (0.01*0.20*weightKilograms)*overallKilometres;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weightKilograms, price );

    }
}
