package forLoop.Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Double pointsAcademy = Double.parseDouble(scanner.nextLine());
        Double overallPointsJury = 0.0 + pointsAcademy;


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (overallPointsJury <= 1250.5) {
                String nameJury = scanner.nextLine();
                Double pointsJury = Double.parseDouble(scanner.nextLine());
                int nameLength = nameJury.length();
                overallPointsJury += (nameLength * pointsJury) / 2;


            } else {
                break;
            }

        }
        if (overallPointsJury<1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", name, (1250.5 - (overallPointsJury)));
        }else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, overallPointsJury);
        }

    }
}