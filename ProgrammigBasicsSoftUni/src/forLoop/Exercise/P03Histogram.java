package forLoop.Exercise;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numUnder200 = 0;
        int num200To399 = 0;
        int num400To599=0;
        int num600To799=0;
        int num800Up = 0;
        for (int i = 1; i<=n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (number <200){
                numUnder200 +=1;
            } else if (number <=399){
                num200To399 +=1;
            }else if (number <=599) {
                num400To599 +=1;
            }else if (number <=799){
                num600To799 +=1;
            }else {
                num800Up +=1;
            }
        }
        Double p1 = (numUnder200*100.00)/n;
        Double p2 = (num200To399*100.00)/n;
        Double p3 = (num400To599*100.00)/n;
        Double p4 = (num600To799*100.00)/n;
        Double p5 = (num800Up*100.00)/n;
        System.out.printf("\n%.2f%%",p1);
        System.out.printf("\n%.2f%%",p2);
        System.out.printf("\n%.2f%%",p3);
        System.out.printf("\n%.2f%%",p4);
        System.out.printf("\n%.2f%%",p5);
    }
}
