package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double wInMetres = Double.parseDouble(scanner.nextLine());
//        double hInMetres = Double.parseDouble(scanner.nextLine());
//        double wInCentimetres = wInMetres*100;
//        double hInCentimetres = hInMetres*100;
//        double S = wInCentimetres*hInCentimetres;
//        double wWorkingPlace = 120;
//        double hWorkingPlace = 70;
//        double sWorkingPlace = wWorkingPlace*hWorkingPlace;
//        double wDoor = 160;
//        double hDoor = 160;
//        double sDoor = wDoor*hDoor;
//        double wConsole = 160;
//        double hConsole = 120;
//        double sConsole = wConsole*hConsole;
//        double wCorridor = wInCentimetres-hDoor-hConsole;
//        double hCorridor = 100;
//        double sCorridor = wCorridor*hCorridor;
////        double sForWorkingPlaces = S - sCorridor-sConsole-sDoor;
//        double sForWorkingPlaces = S - sCorridor;
////        double numberWorkingPlaces = sForWorkingPlaces/sWorkingPlace;
//        double numberWorkingPlaces = sForWorkingPlaces/sWorkingPlace;
//        double finalPlaces = numberWorkingPlaces - 3;
//        System.out.printf("%.0f", finalPlaces);

        Scanner scanner = new Scanner(System.in);
        double wInMetres = Double.parseDouble(scanner.nextLine()); //дължина
        double hInMetres = Double.parseDouble(scanner.nextLine()); // широчина
        double length = wInMetres*100; //дължина в см
        double width = (hInMetres*100)-100; //широчина в см минус коридор
        double lengthWorkingPlace = 120;
        double widthWorkingPlace = 70;
        int  rows = (int) (length/lengthWorkingPlace);
        int columns = (int) (width/widthWorkingPlace);
        double numberWorkingPlaces = (rows*columns) - 3;
        System.out.printf("%.0f", numberWorkingPlaces);


    }
}
