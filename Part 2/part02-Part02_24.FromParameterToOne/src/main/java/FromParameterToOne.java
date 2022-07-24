

public class FromParameterToOne {

    public static void main(String[] args) {
        printUntilNumber(5);

    }

    public static void printUntilNumber(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        };
    }

}
