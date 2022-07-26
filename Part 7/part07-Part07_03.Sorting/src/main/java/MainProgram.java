import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int val : array) {
            if (val < smallest) {
                smallest = val;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        int currIndex = 0;
        for (int val : array) {
            if (val < smallest) {
                smallestIndex = currIndex;
                smallest = val;
            }
            currIndex++;
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                smallestIndex = i;
            }

        };

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int placeholder = array[index1];

        array[index1] = array[index2];

        array[index2] = placeholder;

    }

    public static void sort (int[] array){
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }
}