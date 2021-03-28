// SelectionSort
// unstable algorithm
// O(n^2)
// better than bubbleSort because there are not so many swaps ( 1 / iteration)

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array is : ");
        printArray(intArray);
        int counter = 1;

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfMax = 0; // set the first element as the maximum element
            System.out.println("\nIteration number " + counter);
            counter++;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[indexOfMax]) {
                    indexOfMax = i; // find the max element in the array
                }
            }

            System.out.println("Swapping " + intArray[indexOfMax] + " with " + lastUnsortedIndex);
            swap(indexOfMax, lastUnsortedIndex, intArray); // swap the max element with the lastUnsortedIndex
            System.out.println("The array looks like this :");
            printArray(intArray);

        }

        System.out.println("\nSorted array is :");
        printArray(intArray);

    }

    private static void printArray(int[] array) {
        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println("\n");
    }

    private static void swap(int indexOne, int indexTwo, int[] array) {

        if (indexOne == indexTwo) {
            return;
        }
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
