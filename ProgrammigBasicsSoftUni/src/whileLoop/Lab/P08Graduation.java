package whileLoop.Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double yearAssessmentSum = 0.0;

        int grade = 1;
        int n = 0;
        while (grade <= 12) {
            if (n > 1) {
                break;
            }
            double yearAssessment = Double.parseDouble(scanner.nextLine());
            if (yearAssessment < 4.00) {
                n ++;
                continue;
            }
            grade += 1;
            yearAssessmentSum += yearAssessment;
            }
        double averageAssessment = yearAssessmentSum / 12;
        if (n >1) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        }
        if (n < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageAssessment);

        }
    }
}

