public class Main {

    public static void main(String[] args) {

        int iterativeFactorialResult = iterativeFactorial(5);
        int recursiveFactorialResult = recursiveFactorial(5);

        System.out.println("Iterative factorial is : " + iterativeFactorialResult);
        System.out.println("Recursive factorial is : " + recursiveFactorialResult);

    }

    private static int iterativeFactorial(int number) {
        int prod = 1;
        if (number == 0) {
            return 1;
        } else {
            for (int i = 1; i <= number; i++) {
                prod *= i;
            }
            return prod;
        }
    }

    private static int recursiveFactorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);

    }
}
