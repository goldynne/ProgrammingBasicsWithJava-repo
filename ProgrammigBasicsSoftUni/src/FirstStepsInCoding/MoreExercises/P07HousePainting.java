package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //лице на квадрат
        double sSquare = x*x;
        //лице на врата на предната стена
        double sDoor = 1.2*2;
        double sSquareWithoutDoor = sSquare-sDoor;

        //общо лице на квадрати
        double sSquaresFinal = sSquare+sSquareWithoutDoor;

        //лице на правоъгълни стени
        double sRectangle = x*y;
        double sWindow = 1.5*1.5;
        //лице на правоъгълна стена без прозорец
        double sRectangleWithoutWindow = sRectangle-sWindow;

        //общо лице на правоъгълни стени
        double sRectanglesFinal = sRectangleWithoutWindow*2;

        //общо лице на правоъгълни и квадратни стени без прозорци и врата
        double sSquaresRectanglesFinal = sSquaresFinal+sRectanglesFinal;

        //разход на зелена боя за квадратен метър
        double greenPaintForASquareMetre = 1/3.4;

        //наобходими литри зелена боя
        double necessaryGreenPaint = sSquaresRectanglesFinal*greenPaintForASquareMetre;

        //правоъгълници на покрива
        double sRectanglesRoof = sRectangle*2;

        //триъгълници на покрива
        double sTriangle = (x*h)/2;
        double sTrianglesFinal = sTriangle*2;

        //лице на покрива
        double sRoof = sRectanglesRoof + sTrianglesFinal;
        //разход на червена боя за квадратен метър
        double redPaintForASquareMetre = 1/4.3;

        //необходими литри червена боя
        double necessaryRedPaint = sRoof*redPaintForASquareMetre;

        System.out.printf("%.2f",necessaryGreenPaint);
        System.out.printf("\n"+"%.2f", necessaryRedPaint);

    }
}
