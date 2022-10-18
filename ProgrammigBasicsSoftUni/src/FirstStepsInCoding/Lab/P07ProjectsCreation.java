package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameArchitect = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int necessaryHours = projects * 3;
        System.out.printf("The architect %s will need %s hours to complete %s project/s.", nameArchitect, necessaryHours, projects);
        //System.out.println("The architect " + nameArchitect + " will need " + necessaryHours + " hours to complete " + projects + " project/s.");


    }
}
