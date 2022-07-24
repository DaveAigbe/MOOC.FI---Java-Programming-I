
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int highest = number1;

        if (number2 > highest) {
            highest = number2;
            if (number3 > highest) {
                highest = number3;
            }
        } else if (number3 > highest) {
            highest = number3;
        }
        return highest;

    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
