import java.util.ArrayList;

public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<>();
    }

    public Bird findBird(String name){
        for (Bird bird : birds){
            if (bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (this.birds.isEmpty()){
            return true;
        }
        return false;
    }

    public void addBird(String name, String latinName){
        birds.add(new Bird(name, latinName));
    }

    public void addObservation(String name){
        if (findBird(name) != null){
            findBird(name).updateObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public boolean printAll(){
        if (birds.size() > 0){
            for (Bird bird : birds){
                System.out.println(bird);
            }
            return true;
        }
        return false;
    }

    public void printOne(String name){
        if (findBird(name) != null){
            System.out.println(findBird(name));;
        }
    }

}
