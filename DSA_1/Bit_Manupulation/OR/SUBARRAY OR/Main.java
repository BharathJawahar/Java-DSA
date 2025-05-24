
import java.util.ArrayList;
import java.util.Arrays;

// You are given an array of integers A of size N.
// The value of a subarray is defined as BITWISE OR of all elements in it.
// Return the sum of value of all subarrays of A % 10^9 + 7.

public class Main {
    public static void main(String[] args) {
        System.out.println(subarrayOR(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(subarrayOR(new ArrayList<>(Arrays.asList(7, 8, 9, 10))));
    }
    public static int subarrayOR(ArrayList<Integer> A) {
        int or = 0;
        for(Integer i : A) {
            or = (or|i);
        }
        return or;
    }
}
