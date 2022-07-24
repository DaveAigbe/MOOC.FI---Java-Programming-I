
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = 0;
        String longestName = "";
        int yearsCounter = 0;
        int yearsTotal = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            int length = pieces[0].length();
            String name = pieces[0];

            if (longest < length) {
                longest = length;
                longestName = name;
            }

            yearsCounter++;
            yearsTotal += Integer.valueOf(pieces[1]);
        }

        double average = (double) yearsTotal / yearsCounter;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);


    }
}
