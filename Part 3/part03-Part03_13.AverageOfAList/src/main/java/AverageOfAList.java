
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        while (true) {
            int val = Integer.valueOf(scanner.nextLine());

            if (val == -1) {
                break;
            }

            numbers.add(val);
        }

        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;

        for (int num: numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Average: " + average);

    }
}
