
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int val = Integer.valueOf(scanner.nextLine());

        for (int i = val; i <= 100; i++) {
            System.out.println(i);
        };

    }
}
