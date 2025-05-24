// Given an array A of N integers.
// Find the length of the longest subarray in the array which sums to zero.
// If there is no subarray which sums to zero then return 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestSubarrayLength(new ArrayList<>(Arrays.asList(1, -2, 1, 2))));
        System.out.println(longestSubarrayLength(new ArrayList<>(Arrays.asList(3, 2, -1))));
    }
    public static int longestSubarrayLength(ArrayList<Integer> A) {
        int length = 0, sum = 0;
        HashMap<Long, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0L, -1);
        for (int idx = 0; idx < A.size(); idx++) {
            sum += A.get(idx);
            if(!prefixSum.containsKey((long)sum))     prefixSum.put((long)sum, idx);
            else    length = Math.max(length, idx-prefixSum.get((long)sum));
        }
        return length;
    }
}