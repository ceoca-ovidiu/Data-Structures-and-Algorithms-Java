// RadixSort
// O(n)
// Make assumption about the data
// It is based  on a radix and a width
// stable sort

public class Main {

    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        System.out.println("Unsorted array : ");
        printArray(intArray);

        radixSort(intArray, 10, 4);

        System.out.println("Sorted array : ");
        printArray(intArray);
    }

    private static void printArray(int[] array) {
        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println("\n");
    }

    private static void radixSort(int[] inputArray, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(inputArray, i, radix);
        }
    }

    private static void radixSingleSort(int[] inputArray, int position, int radix) {

        int numItems = inputArray.length; // how many items will be sorted
        int[] countArray = new int[radix];

        for (int value : inputArray) {
            countArray[getDigit(position, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] tempArray = new int[numItems];

        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--countArray[getDigit(position, inputArray[tempIndex], radix)]] = inputArray[tempIndex];
        }

        for (int k = 0; k < numItems; k++) {
            inputArray[k] = tempArray[k];
        }

    }

    private static int getDigit(int position, int value, int radix) {

        return value / (int) Math.pow(10, position) % 10;

    }
}
