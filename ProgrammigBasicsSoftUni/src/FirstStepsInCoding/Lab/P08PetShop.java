package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());
        double dogFood = dogs * 2.5;
        double animalFood = otherAnimals * 4.0;
        double overallFood = dogFood + animalFood;

        System.out.printf("%s lv.", overallFood);

    }
}
