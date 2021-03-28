// QuickSort
// O(nlogn)
// unstable sort
// it works based on pivots
// recursive algorithm

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array : ");
        printArray(intArray);

        quickSort(intArray, 0, intArray.length);

        System.out.println("Sorted array : ");
        printArray(intArray);

    }

    private static void printArray(int[] array) {
        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println("\n");
    }

    private static void quickSort(int[] inputArray, int startIndex, int endIndex) {

        if (endIndex - startIndex < 2) {
            return;
        }

        int pivotIndex = partition(inputArray, startIndex, endIndex);

        quickSort(inputArray, startIndex, pivotIndex);
        quickSort(inputArray, pivotIndex + 1, endIndex);

    }

    private static int partition(int[] inputArray, int startIndex, int endIndex) {

        int pivot = inputArray[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (i < j) {
            while (i < j && inputArray[--j] >= pivot) ;
            if (i < j) {
                inputArray[i] = inputArray[j];
            }
            while (i < j && inputArray[++i] <= pivot) ;
            if (i < j) {
                inputArray[j] = inputArray[i];
            }
        }
        inputArray[j] = pivot;
        return j;
    }
}
