// InsertionSort
// Stable sort
// O(n^2)

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array is : ");
        printArray(intArray);

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int tempElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > tempElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            System.out.println("Moving " + tempElement + " on the position " + i);
            intArray[i] = tempElement;
            printArray(intArray);

        }

        System.out.println("\nSorted array is : ");
        printArray(intArray);

    }

    private static void printArray(int[] array) {
        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println("\n");
    }
}
