// Print N numbers in Decreasing Order and then in Increasing Order.

// You are given a positive number N.
// You are required to print the numbers from N to 1.
// You are required to not use any loops. Don't change the signature of the function DecThenInc function.
// Note : Please print an new line after printing the output.

public class Main {
    public static void main(String[] args) {
        DecThenInc(10);
    }
    public static void DecThenInc(int n) {
        System.out.print(n + " ");
        if (n>1)    DecThenInc(n-1);
        System.out.print(n + " ");
    }
}
