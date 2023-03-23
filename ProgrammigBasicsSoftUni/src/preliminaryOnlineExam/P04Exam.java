package preliminaryOnlineExam;

import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double overallGrades = 0;
        int numberFail = 0;
        int numberBetween300And399 = 0;
        int numberBetween400And499 = 0;
        int numberTopStudents = 0;
        int currentStudent = 0;
        while (currentStudent<numberStudents){
            if (grade >= 2.00 && grade <=2.99){
                numberFail +=1;
            } else if (grade >=3.00 && grade <=3.99){
                numberBetween300And399 +=1;
            }else if (grade >=4.00 && grade <=4.99){
                numberBetween400And499 ++;
            }else if (grade >=5.00){
                numberTopStudents ++;
            }
            overallGrades +=grade;
            currentStudent++;
            if (currentStudent>=numberStudents){
                break;
            }
            grade = Double.parseDouble(scanner.nextLine());

        }
        double averageGrades = overallGrades/numberStudents;
        double percentFail = 1.00*numberFail/numberStudents*100;
        double percentBetween300And399 = 1.00*numberBetween300And399/numberStudents*100;
        double percentBetween400And499 = 1.00*numberBetween400And499/numberStudents*100;
        double percentTopStudents = 1.00*numberTopStudents/numberStudents*100;
        System.out.printf("Top students: %.2f%%\n", percentTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentBetween400And499);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentBetween300And399);
        System.out.printf("Fail: %.2f%%\n", percentFail);
        System.out.printf("Average: %.2f", averageGrades);
    }
}
