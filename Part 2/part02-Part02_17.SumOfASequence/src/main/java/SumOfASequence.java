
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int total = 0;

        System.out.print("Last number? ");
        int val = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= val; i++) {
            total += i;
        };
        System.out.println("The sum is " + total);

    }
}
