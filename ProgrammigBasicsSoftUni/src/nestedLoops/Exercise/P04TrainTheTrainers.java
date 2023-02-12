package nestedLoops.Exercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryNumber = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int numberPresentations = 0;
        double overallAverageGrades = 0;
        while (!input.equals("Finish")) {
            numberPresentations += 1;
            double currentPresentationOverallGrades = 0;
            for (int i = 1; i <= juryNumber; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentPresentationOverallGrades += grade;
            }
            double currentPresentationAverageGrade = currentPresentationOverallGrades / juryNumber;
            overallAverageGrades += currentPresentationAverageGrade;
            System.out.printf("%s - %.2f.\n", input, currentPresentationAverageGrade);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", overallAverageGrades / numberPresentations);

    }

}
