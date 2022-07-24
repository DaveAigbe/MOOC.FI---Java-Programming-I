
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int sum = 0;
        int counter = 0;

        while (true) {
            int val = Integer.valueOf(scanner.nextLine());

            if (val == 0) {
                if (sum > 0){
                    double average = (double) sum / counter;
                    System.out.println(average);
                    break;

                } else {
                    System.out.println("Cannot calculate the average");
                    break;
                }
            } else if (val > 0) {
                counter++;
                sum += val;
            }
        }

    }
}
