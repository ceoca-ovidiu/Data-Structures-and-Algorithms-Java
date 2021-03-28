// CountingSort
// O(n)
// it can be stable with some modifications
// values must be within a specific range
// only works with non-negative discrete values (no floats, no strings)

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.println("Unsorted array : ");
        printArray(intArray);

        countingSort(intArray, 0, intArray.length);

        System.out.println("Sorted array : ");
        printArray(intArray);
    }

    private static void printArray(int[] array) {
        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println("\n");
    }

    private static void countingSort(int[] inputArray, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        for (int i : inputArray) {
            countArray[i - min] += 1;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                inputArray[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
