import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;

        if (items.isEmpty()) {
            return totalWeight;
        }

        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }


    public boolean overweightCheck(Item newItem) {
        int totalWeight = totalWeight();
        // If the list is empty add the new items weight to 0
        if (items.isEmpty()) {
            return newItem.getWeight() > this.maxWeight;
        }

        // Add the current item weights together, then add the new items weight

        return totalWeight + newItem.getWeight() > this.maxWeight;
    }

    public void addItem(Item item) {
        if (!(overweightCheck(item))) {
            items.add(item);
        }

    }

    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }

        return heaviest;
    }


    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item " + "(" + totalWeight() + " kg)";
        } else {
            return items.size() + " items " + "(" + totalWeight() + " kg)";
        }
    }




}
