
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your code here
        System.out.println("Give the first number:");
        int valOne = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int valTwo = Integer.valueOf(scan.nextLine());

        if (valOne == valTwo) {
            System.out.println("The numbers are equal!");
        } else if ( valOne > valTwo) {
            System.out.println("Greater number is: " + valOne);
        } else{
            System.out.println("Greater number is: " + valTwo);
        }



    }
}
