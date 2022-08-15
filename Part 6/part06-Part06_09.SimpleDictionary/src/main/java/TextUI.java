import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        label:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    break label;
                case "add":
                    System.out.print("Word: ");
                    String word = scanner.nextLine();

                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();

                    dictionary.add(word, translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String translateWord = scanner.nextLine();

                    String translated = dictionary.translate(translateWord);
                    if (translated == null) {
                        System.out.println("Word " + translateWord + " was not found");
                    } else {
                        System.out.println(translated);
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }


        }

    }


}
