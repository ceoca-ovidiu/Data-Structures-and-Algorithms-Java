// BubbleSort algorithm
// complexity is O(n^2)
// stable sort

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int counter = 1;

        System.out.println("The unsorted array is : ");
        printArray(intArray);

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            System.out.println("\nIteration number " + counter);
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    System.out.println("Swapping " + intArray[i] + " with " + intArray[i + 1]);
                    swap(intArray, i, i + 1);
                }
            }
            counter++;
        }

        System.out.println("\nThe sorted array is : ");
        printArray(intArray);

    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        if (indexOne == indexTwo) {
            return;
        }
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public static void printArray(int[] array) {

        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println();
    }
}