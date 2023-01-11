package forLoop.Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsNumber = Integer.parseInt(scanner.nextLine());
        int overallPeople = 0;
        int musala = 0;
        int monblanc = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        for (int i = 0; i < groupsNumber; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine());
            overallPeople += numberPeople;
            if (numberPeople <= 5) {
                musala += numberPeople;
            } else if (numberPeople >= 6 && numberPeople <= 12) {
                monblanc += numberPeople;
            } else if (numberPeople >= 13 && numberPeople <= 25) {
                kilimandjaro += numberPeople;
            } else if (numberPeople >= 26 && numberPeople <= 40) {
                k2 += numberPeople;
            } else {
                everest += numberPeople;
            }
        }
//        Double pMusala = ((1.0*musala)/overallPeople)*100;
//        Double pMonblanc = ((1.0*monblanc)/overallPeople)*100;
//        Double pKilimandjaro = ((1.0*kilimandjaro)/overallPeople)*100;
//        Double pK2 = ((1.0*k2)/overallPeople)*100;
//        Double pEverest = ((1.0*everest)/overallPeople)*100;
        System.out.printf("%.2f%%", ((1.0 * musala) / overallPeople) * 100);
        System.out.printf("\n%.2f%%", ((1.0 * monblanc) / overallPeople) * 100);
        System.out.printf("\n%.2f%%", ((1.0 * kilimandjaro) / overallPeople) * 100);
        System.out.printf("\n%.2f%%", ((1.0 * k2) / overallPeople) * 100);
        System.out.printf("\n%.2f%%", ((1.0 * everest) / overallPeople) * 100);

    }
}

