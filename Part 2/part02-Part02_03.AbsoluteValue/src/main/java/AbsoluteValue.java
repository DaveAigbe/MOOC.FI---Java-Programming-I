
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int val;
        int absVal;

        val = Integer.valueOf(scanner.nextLine());

        absVal = val;

        if (absVal < 0) {
            absVal *= -1;
        }


        System.out.println(absVal);

    }
}
