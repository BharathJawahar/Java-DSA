// Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
// If the given array contains a sub-array with sum zero return 1, else return 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(is0SumSubarray(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(is0SumSubarray(new ArrayList<>(Arrays.asList(4, -1, 1))));
    }
    public static int is0SumSubarray(ArrayList<Integer> A) {
        HashSet<Long> preSumHashSet = new HashSet<>();
        long sum = 0;
        preSumHashSet.add((long)0);
        for(Integer i : A) {
            sum += (long)i;
            if(preSumHashSet.contains((long)sum))   return 1;
            preSumHashSet.add((long)sum);
        }
        return 0;
    }
}
