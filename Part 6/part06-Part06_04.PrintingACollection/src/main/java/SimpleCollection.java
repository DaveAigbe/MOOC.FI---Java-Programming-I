
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String values = "";

        if (elements.size() > 0) {
            for (String elm : elements) {
                values = values + elm + "\n" ;
            }



            if (elements.size() == 1) {
                return "The collection " + this.name +  " has 1 element:" + "\n" + values.trim();
            } else {
                return "The collection " + this.name  + " has " + elements.size() + " elements:" + "\n" + values.trim();
            }

        }


        return "The collection " + this.name  + " is empty.";
    }

}
