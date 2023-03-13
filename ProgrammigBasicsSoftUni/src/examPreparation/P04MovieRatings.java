package examPreparation;

import java.util.Scanner;

public class P04MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMovies = Integer.parseInt(scanner.nextLine());

        String movieNameMaxRating = "";
        double maxRating = Double.MIN_VALUE;

        String movieNameMinRating = "";
        double minRating = Double.MAX_VALUE;

        double sumRating = 0;
        for (int movie = 1; movie <= countMovies ; movie++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());
            sumRating += movieRating;
            if (movieRating > maxRating) {
                maxRating = movieRating;
                movieNameMaxRating = movieName;
            }
            if (movieRating < minRating){
                minRating = movieRating;
                movieNameMinRating = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n",movieNameMaxRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieNameMinRating, minRating);
        double averageRating = sumRating/countMovies;
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
