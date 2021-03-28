// ShellSort
// gap is calculated with (3^k - 1) / 2
// worst case is O(n^2)
// it performs better than insertion sort
// unstable sort

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array is : ");
        printArray(intArray);

        for(int gap = intArray.length / 2 ; gap > 0 ; gap /= 2){ // for this example we set the gap to be the array length divided by 2

            for(int i = gap ; i < intArray.length ; i++){
                int tempElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j-gap] > tempElement){
                    intArray[j] = intArray[j-gap];
                    j = j - gap;
                }
                System.out.println("Swapping " + intArray[j] + " with " + tempElement);
                intArray[j] = tempElement;
                printArray(intArray);
            }
        }
        System.out.println("Sorted array is : ");
        printArray(intArray);
    }

    private static void printArray (int[] array){
        for(int iterator : array){
            System.out.print(iterator + " ");
        }
        System.out.println("\n\n");
    }

}
