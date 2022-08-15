import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int holdWeight() {
        int weight = 0;

        if (suitcases.isEmpty()){
            return weight;
        }

        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }

        return weight;

    }

    public boolean tooHeavy(Suitcase suitcase) {
        if (suitcases.isEmpty()) {
            return suitcase.totalWeight() > maxWeight;
        }

        return (holdWeight() + suitcase.totalWeight()) > maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(tooHeavy(suitcase))) {
            suitcases.add(suitcase);
        }
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }

    public String toString(){
        return suitcases.size() + " suitcases " + "(" + holdWeight() + " kg)";
    }


}
