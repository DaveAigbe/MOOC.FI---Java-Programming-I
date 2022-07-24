
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.print("What is the edge length? ");
        int input = Integer.valueOf(scanner.nextLine());

        Cube myCube = new Cube(input);

        System.out.println(myCube);
    }
}
