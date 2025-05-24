// Given an array of integers A and an integer B.
// Find the total number of subarrays having sum equals to B.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(subarraySum(new ArrayList<>(Arrays.asList(1, 0, 1)),1));
        System.out.println(subarraySum(new ArrayList<>(Arrays.asList(0, 0, 0)),0));
    }
    public static int subarraySum(ArrayList<Integer> A, int B) {
        HashMap<Long, Integer> preSumHashMap = new HashMap<>();
        long sum = 0;
        int count = 0;
        preSumHashMap.put(0L,1);
        for(Integer i : A) {
            sum += i;
            long remaining = sum - B;
            if(preSumHashMap.containsKey(remaining))   count += preSumHashMap.get(remaining);
            preSumHashMap.put(sum, preSumHashMap.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
