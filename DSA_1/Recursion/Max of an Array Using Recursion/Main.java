// Given an array A of size N, write a recursive function that returns the maximum element of the array.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMax(new ArrayList<>(Arrays.asList(1, 2, 3, 5, 1))));
        System.out.println(getMax(new ArrayList<>(Arrays.asList(10, 2, 3, 5, 1))));
        System.out.println(getMax(new ArrayList<>(Arrays.asList(10, 2, 300, 5, 1))));
        System.out.println(getMax(new ArrayList<>(Arrays.asList(10, 2, 300, 5, 1000))));
    }
    public static int getMax(ArrayList<Integer> A) {
        return getMaxRecursive(A, 0, A.get(0));
    }
    public static int getMaxRecursive(ArrayList<Integer> A, int index, int max) {
        if(A.size()==index) {
            return max;
        }
        max = Math.max(A.get(index), max);
        return (getMaxRecursive(A, index+1, max));
    }
}
