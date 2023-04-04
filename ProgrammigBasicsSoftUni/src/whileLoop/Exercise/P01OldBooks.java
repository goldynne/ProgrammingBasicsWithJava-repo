package whileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favouriteBook = scanner.nextLine();
        String bookName = scanner.nextLine();
        int booksNumber = 0;
        while (!bookName.equals(favouriteBook)) {
            if (bookName.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", booksNumber);
                break;
            }
            booksNumber ++;
            bookName = scanner.nextLine();
        }
        if (bookName.equals(favouriteBook)) {
            System.out.printf("You checked %d books and found it.", booksNumber);
        }
    }
}
