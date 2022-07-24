
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int factorial = 1;

        System.out.print("Give a number: ");
        int val = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= val; i++) {
            factorial *=  i;
        };

        System.out.println("Factorial: " + factorial);


    }
}
