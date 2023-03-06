package nestedLoops.MoreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String beginning = scanner.nextLine();
        String end = scanner.nextLine();
        String letterToExclude = scanner.nextLine();
        int overallNumberCombinations = 0;
        for (char i = beginning.charAt(0); i <=end.charAt(0) ; i++) {
            for (char j = beginning.charAt(0); j <=end.charAt(0); j++) {
                for (char k = beginning.charAt(0); k <=end.charAt(0) ; k++) {
                    if (i!=(letterToExclude.charAt(0)) && j!=(letterToExclude.charAt(0)) && k!=(letterToExclude.charAt(0))){
                        System.out.print(i+"" + j +"" + k + " ");
                        overallNumberCombinations++;
                    }

                }

            }
        }
        System.out.println(overallNumberCombinations);
    }
}
