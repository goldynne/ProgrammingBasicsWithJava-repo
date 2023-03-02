package nestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorNum = Integer.parseInt(scanner.nextLine()); //6
        int roomsNum = Integer.parseInt(scanner.nextLine()); //4
        int currentRoomNum = 0;
        int apartmentsNum = 0;
        int officesNum = 0;
        int lastFloor = floorNum;
        while (floorNum > 0) {
            while (currentRoomNum < roomsNum) {
                if (lastFloor == floorNum) {
                    System.out.printf("L%d%d ", floorNum, currentRoomNum);
                } else if (floorNum % 2 == 0) {

                    System.out.printf("O%d%d ", floorNum, currentRoomNum);
                } else {
                    System.out.printf("A%d%d ", floorNum, currentRoomNum);
                }
                currentRoomNum++;
            }
            floorNum -= 1;
            currentRoomNum = 0;
            System.out.println();

        }
    }
}