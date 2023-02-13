package nestedLoops.Exercise;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        for (int i = 1111; i <= 9999; i++) {
//            for (int j = (i % 10); j <= 9; j++) {
//                for (int k = ((i % 100) / 10); k <= 9; k++) {
//                    for (int l = ((i % 1000) / 100); l <= 9; l++) {
//                        for (int m = (i / 1000); m <= 9; m++) {
//                            if (n % j == 0 && n % k == 0 && n % l == 0 && n % m == 0) {
//                                System.out.print(i+" ");
//                            }
//                        }
//
//                    }
//
//                }
//
//            }
//            if (n % (i % 10) == 0) {
//                if (n % ((i % 100) / 10) == 0) {
//                    if (n % ((i % 1000) / 100) == 0) {
//                        if (n % (i / 1000) == 0) {
//                            System.out.print(i+" ");
//
//                        }
//                    }
//                }
//            }
//        for (int i = 1; i <=9 ; i++) {
//            if (n%i ==0){
//                for (int j = 0; j < ; j++) {
//
//                }
//
//        }
//        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.print(i +""+ j+"" + k+ "" + l+ " ");
                        }

                    }

                }

            }

        }
    }
}
