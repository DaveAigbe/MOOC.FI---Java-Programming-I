
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics calcSum = new Statistics();
        Statistics countEven = new Statistics();
        Statistics countOdd = new Statistics();


        System.out.println("Enter numbers:");
        while (true) {
            int val = Integer.valueOf(scanner.nextLine());

            if (val == -1){
                System.out.println("Sum: " + calcSum.sum());
                System.out.println("Sum of even numbers: " + countEven.sum());
                System.out.println("Sum of odd numbers: " + countOdd.sum());
                break;
            }

            if (val % 2 == 0){
                countEven.addNumber(val);
            } else {
                countOdd.addNumber(val);
            }


            calcSum.addNumber(val);
        }

    }
}
