import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private final Scanner scanner;
    private ArrayList<Integer> grades;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grades = new ArrayList<>();
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int val = Integer.valueOf(scanner.nextLine());

            if (val == -1) {
                break;
            }

            if (val >= 0 && val <= 100){
                grades.add(val);
            }

        }
        evaluate();
    }

    public void evaluate() {

        PointAverage pointAverage = new PointAverage(grades);
        PassingAverage passingAverage = new PassingAverage(grades);
        PassPercentage passPercentage = new PassPercentage(grades);
        GradeDistribution gradeDistribution = new GradeDistribution(grades);


        System.out.println(pointAverage);
        System.out.println(passingAverage);
        System.out.println(passPercentage);
        System.out.println(gradeDistribution);
    }


}
