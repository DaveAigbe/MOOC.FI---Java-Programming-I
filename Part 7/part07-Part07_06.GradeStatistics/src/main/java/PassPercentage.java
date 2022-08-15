import java.util.ArrayList;

public class PassPercentage {
    private final ArrayList<Integer> list;

    public PassPercentage(ArrayList<Integer> list){
        this.list = list;
    }

    public double passPercentage(){
        int passed = 0;
        for (int score : list){
            if (score >= 50){
                passed++;
            }

        }
            if (passed > 0){
                return (double) (100*passed)/list.size();
            }
            return 0.0;

    }

    public String toString(){
        return "Pass percentage: " + passPercentage();
    }
}
