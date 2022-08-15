import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;


    public Room(){
        this.persons = new ArrayList<>();
    }

    public boolean isEmpty(){
        return persons.isEmpty();
    }

    public void add(Person person){
        persons.add(person);
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    public Person shortest(){
        if (persons.isEmpty()){
            return null;
        }

        Person currShortest = persons.get(0);

        for (Person person : persons){
            if (currShortest.getHeight() > person.getHeight()){
                currShortest = person;
            }
        }
        return currShortest;

    }

    public Person take(){
        if (persons.isEmpty()){
            return null;
        }
        Person toRemove = shortest();

        persons.remove(toRemove);

        return toRemove;


    }


}
