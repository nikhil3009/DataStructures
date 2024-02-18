package Recursion;

public class Fibonaci_recursion {
    public static int[] generateFibonacciNumbers(int n) {
        if (n <= 0) {
            return new int[0]; // Return an empty array for non-positive input
        }
        if (n == 1) {
            return new int[]{0}; // Return an array with only the first Fibonacci number
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 0; // First Fibonacci number
        fibonacci[1] = 1; // Second Fibonacci number

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
