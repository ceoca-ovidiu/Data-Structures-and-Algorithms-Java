// MergeSort
// O(nlogn) - base 2
// stable sort

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted array is : ");
        printArray(intArray);

        mergeSort(intArray, 0 , intArray.length);

        System.out.println("Sorted array is : ");
        printArray(intArray);

    }

    private static void mergeSort(int[] array, int startPoint, int endPoint) {

        if (endPoint - startPoint < 2) { // we have a one element array
            return;
        }

        int midPoint = (startPoint + endPoint) / 2;

        mergeSort(array, startPoint, midPoint); // this part handles the first part of the array
        mergeSort(array, midPoint, endPoint); // this part handles the second part of the array
        merge(array, startPoint, midPoint, endPoint);


    }

    private static void printArray(int[] array) {
        for (int iterator : array) {
            System.out.print(iterator + " ");
        }
        System.out.println("\n");
    }

    private static void merge(int[] array, int startPoint, int midPoint, int endPoint) {

        if (array[midPoint - 1] <= array[midPoint]) { // it means that the array is already sorted
            return;
        }

        int i = startPoint;
        int j = midPoint;
        int tempIndex = 0;

        int[] tempArray = new int[endPoint - startPoint];

        while (i < midPoint && j < endPoint) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, startPoint + tempIndex, midPoint - i);
        System.arraycopy(tempArray, 0, array, startPoint, tempIndex);

    }
}
