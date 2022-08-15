import javax.xml.crypto.Data;
import java.util.Scanner;
public class UserInterface {
    private final Scanner scanner;
    private Database database;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.database = new Database();
    }

    public void run(){
        while (true) {
            System.out.print("? ");
            String cmd = scanner.nextLine();

            if (cmd.equals("Quit")){
                break;
            }

            switch (cmd) {
                case "Add":
                    System.out.print("Name: ");
                    String addName = scanner.nextLine();

                    System.out.print("Name in Latin: ");
                    String addLatinName = scanner.nextLine();

                    database.addBird(addName, addLatinName);
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String obvName = scanner.nextLine();

                    database.addObservation(obvName);
                    break;
                case "All":
                    if (!database.isEmpty()){
                        database.printAll();
                    }
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String printOneName = scanner.nextLine();

                    database.printOne(printOneName);
                    break;

            }

        }
    }
}
