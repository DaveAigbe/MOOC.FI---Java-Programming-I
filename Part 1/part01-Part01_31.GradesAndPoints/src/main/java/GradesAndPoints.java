
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int valOne = Integer.valueOf(scan.nextLine());


        if (valOne > 100) {
            System.out.println("incredible!");
        } else if (90 <= valOne && valOne <= 100) {
            System.out.println("5");
        } else if (80 <= valOne && valOne <= 89) {
            System.out.println("4");
        } else if (70 <= valOne && valOne <= 79) {
            System.out.println("3");
        } else if (60 <= valOne && valOne <= 69) {
            System.out.println("2");
        } else if (50 <= valOne && valOne <= 59) {
            System.out.println("1");
        } else if (0 <= valOne && valOne <= 49) {
            System.out.println("failed");
        } else {
            System.out.println("impossible!");
        }

    }
}
