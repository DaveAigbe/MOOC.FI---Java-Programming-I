
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();

        list.add("1");
        list.add("2");
        list.add("3");

        list.print();

        list.remove(2);

        list.print();

        list.add("4");

        list.print();

        list.remove(1);

        list.remove(1);

        list.print();

    }
}
