
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());

            if (val == 0) {
                System.out.println("Number of numbers: " + counter);
                break;
            } else {
                counter++;
            }


        }
    }
}
