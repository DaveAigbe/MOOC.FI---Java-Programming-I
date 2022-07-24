
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int val;
        int val2;

        val = Integer.valueOf(scanner.nextLine());
        val2 = Integer.valueOf(scanner.nextLine());

        // Math.sqrt() requires double type, so type cast it to int
        double sqrt = (int) Math.sqrt(val + val2);

        System.out.println(sqrt);


    }
}
