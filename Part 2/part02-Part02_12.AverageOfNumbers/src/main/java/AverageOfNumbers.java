
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());

            if (val == 0) {
                double average = (double) sum / counter;

                System.out.println("Average of the numbers: " + (average));
                break;
            } else {
                counter++;
                sum += val;
            }
        }

    }
}
