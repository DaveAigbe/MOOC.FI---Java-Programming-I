import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them


        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));

        }

        System.out.println();

        System.out.print("What information will be printed? ");
        String infoType = scanner.nextLine();

        for (Book book : books) {
            if (infoType.equals("everything")) {
                System.out.println(book.toString());
            } else if (infoType.equals("name")) {
                System.out.println(book.getName());
            }
        }
    }
}
