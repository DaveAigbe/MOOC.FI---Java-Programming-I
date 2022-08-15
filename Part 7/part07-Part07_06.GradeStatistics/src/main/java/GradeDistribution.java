import java.util.ArrayList;

public class GradeDistribution {
    private final ArrayList<Integer> list;

    public GradeDistribution(ArrayList<Integer> list) {
        this.list = list;
    }

    public String distribute() {
        String five = "", four = "", three = "", two = "", one = "", zero = "";

        for (int grade : list) {
            if (grade >= 90) {
                five += "*";
            } else if (grade >= 80) {
                four += "*";
            } else if (grade >= 70) {
                three += "*";
            } else if ( grade>= 60) {
                two += "*";
            } else if (grade >= 50) {
                one += "*";
            } else {
                zero += "*";
            }
        }

        return "5: " + five + "\n4: " + four + "\n3: " + three + "\n2: " + two + "\n1: " + one + "\n0: " + zero;

    }


    public String toString() {
        return "Grade distribution:\n" + distribute();
    }

}
