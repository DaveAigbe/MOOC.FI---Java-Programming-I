
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Write your program here.
        System.out.println("How old are you?");
        int val = Integer.valueOf(scan.nextLine());

        if (val >= 0 && val <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
