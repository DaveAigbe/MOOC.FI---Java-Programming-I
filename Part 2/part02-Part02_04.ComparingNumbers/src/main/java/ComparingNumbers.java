
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int val;
        int val2;

        val = Integer.valueOf(scanner.nextLine());
        val2 = Integer.valueOf(scanner.nextLine());

        if (val > val2) {
            System.out.println(val + " is greater than " + val2 + ".");
        } else if (val < val2) {
            System.out.println(val + " is smaller than " + val2 + ".");
        } else {
            System.out.println(val + " is equal to " + val2 + ".");
        }


    }
}
