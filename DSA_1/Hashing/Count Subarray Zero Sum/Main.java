
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Given an array A of N integers.
// Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7

public class Main {
    public static void main(String[] args) {
        System.out.println(countSubarraySumZero(new ArrayList<>(Arrays.asList(1, -1, -2, 2))));
        System.out.println(countSubarraySumZero(new ArrayList<>(Arrays.asList(-1, 2, -1))));
    }
    public static int countSubarraySumZero(ArrayList<Integer> A) {
        int count = 0;
        long sum = 0;
        HashMap<Long, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0L, 1);
        for(Integer i : A) {
            sum += i;
            if(prefixSum.containsKey(sum)) {
                count += prefixSum.get(sum);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
