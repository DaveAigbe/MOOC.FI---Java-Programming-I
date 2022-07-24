
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());

            if (val == 0) {
                System.out.println("Number of numbers: " + counter);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                counter++;
                sum += val;
            }
        }

    }
}
