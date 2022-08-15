
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface program = new UserInterface(scanner);
        program.start();
    }
}
