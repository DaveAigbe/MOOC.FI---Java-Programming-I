import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;



public class UserInterface {
    private final Scanner scanner;
    private final Database database;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.database = new Database();
    }

    public void readFile() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try (Scanner openFile = new Scanner(Paths.get(file))) {
            while (openFile.hasNextLine()) {
                // Save the current line
                String name = openFile.nextLine();
                // If the current line is not an empty line
                // If it is an empty line, continue the loop and pass over it
                if (!name.equals("")){
                    ArrayList<String> ingredients = new ArrayList<>();

                    int time = Integer.parseInt(openFile.nextLine());
                    // If the file has not ended yet
                    while (openFile.hasNextLine()) {
                        // Store the current ingredient
                        String ingredient = openFile.nextLine();
                        // If the ingredient is just saved as a whitespace, exit the while
                        if (ingredient.equals("")) {
                            break;
                        }
                        // If the ingredient is not a whitespace, add it to the ingredients array
                        ingredients.add(ingredient);
                    }
                    // Add the name, time and ingredient array to the database as a new recipe
                    database.addRecipe(name, time, ingredients);
                }
            }

        } catch (
                Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public String commands(){
        return "Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient";
    }


    public void run() {
        // Evaluate file and create new recipes for the database
        this.readFile();

        // Print out all commands
        System.out.println(this.commands());

        // Evaluate commands
        while (true) {
            System.out.print("\nEnter command: ");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")){
                break;
            }

            switch (cmd) {
                case "list":
                    System.out.println("\nRecipes:");
                    database.listAll();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String name = scanner.nextLine();

                    System.out.println("\nRecipes:");
                    database.findName(name);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int time = Integer.parseInt(scanner.nextLine());

                    System.out.println("\nRecipes:");
                    database.findCookingTime(time);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();

                    System.out.println("\nRecipes:");
                    database.findIngredient(ingredient);
                    break;
            }

        }

    }
}
