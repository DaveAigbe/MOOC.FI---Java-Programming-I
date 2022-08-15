import java.util.ArrayList;

public class PointAverage {
    private final ArrayList<Integer> list;

    public PointAverage(ArrayList<Integer> list) {
        this.list = list;
    }

    public double average() {
        int total = 0;
        for (int score : list) {
                total += score;
        }

        return (double) total / list.size();
    }

    public String toString() {
        return "Point average (all): " + average();
    }
}
