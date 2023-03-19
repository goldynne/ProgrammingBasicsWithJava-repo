package preliminaryOnlineExam;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinsPercent = Integer.parseInt(scanner.nextLine());
        int carbPercent = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());
        double fatGramsOverall = ((fatPercent/100.0) * allCalories)/9;
        double proteinsGramsOverall = ((proteinsPercent/100.0)*allCalories)/4;
        double carbGramsOverall = ((carbPercent/100.0)*allCalories)/4;
        double foodGramsOverall = fatGramsOverall + proteinsGramsOverall+carbGramsOverall;
        double caloriesPerGram = allCalories/foodGramsOverall;
        double waterCaloriesPercent = 100 - waterPercent;
        double finalCalories = (waterCaloriesPercent/100.0) * caloriesPerGram;
        System.out.printf("%.4f", finalCalories);
    }
}
