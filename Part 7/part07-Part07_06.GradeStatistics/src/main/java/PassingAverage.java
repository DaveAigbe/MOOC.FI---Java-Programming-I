import java.util.ArrayList;

public class PassingAverage {
    private final ArrayList<Integer> list;

    public PassingAverage(ArrayList<Integer> list){
        this.list = list;
    }

    public double passingAverage(){
        int total = 0;
        int counter = 0;
        for (int score : list){
            if (score >= 50){
                total += score;
                counter++;
            }

        }

        if (counter > 0){
            return (double) total/counter;
        }
        return -1;
    }

    public String toString(){
        if (passingAverage() == -1){
            return "Point average (passing): -";
        }
        return "Point average (passing): " + passingAverage();
    }
}
