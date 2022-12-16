package conditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isValid = (num >=100) && (num <=200) || (num == 0);
        if (!isValid) {
            System.out.println("invalid");
        }
//        if (num >=100 && num <=200 || num == 0) {
//            isValid = false;
//
//        }else {
//            System.out.println("invalid");
//        }

    }
}
