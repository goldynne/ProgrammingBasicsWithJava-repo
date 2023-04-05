package whileLoop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        int badGradesNumber = 0;
        boolean enoughBadGrades = false;
        int numberGrades = 0;
        int overallScore = 0;
        String nameLastProblem = "";
        while (!input.equals ("Enough")) {
            if (grade <=4){
                badGradesNumber ++;
                if (badGradesNumber == badGrades) {
                    enoughBadGrades = true;
                    break;
                }
            }
            numberGrades ++;
            overallScore += grade;
            nameLastProblem = input;
            input = scanner.nextLine();
            if (input.equals("Enough")){
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());
        }
        Double averageScore = (1.0*overallScore)/numberGrades;
        if (enoughBadGrades) {
            System.out.printf("You need a break, %d poor grades.", badGradesNumber);
        }else {
            System.out.printf("Average score: %.2f", averageScore);
            System.out.printf("\nNumber of problems: %d", numberGrades);
            System.out.printf("\nLast problem: %s", nameLastProblem);
        }
    }
}
