// Problem Description
// Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
// If the answer does not exist return an array with a single integer "-1".
// First sub-array means the sub-array for which starting index in minimum.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(subarraySum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 5));
        System.out.println(subarraySum(new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105)), 110));
    }
    public static ArrayList<Integer> subarraySum(ArrayList<Integer> A, int B) {
        // int sum = 0, start_idx = 0, end_idx = 0;
        // while(end_idx<A.size()) {
        //     sum += A.get(end_idx);
        //     while(B<sum && start_idx<end_idx) {
        //         sum -= A.get(start_idx);
        //         start_idx++;
        //     }
        //     if(sum==B) {
        //         ArrayList<Integer> subarray = new ArrayList<>();
        //         for (int idx=start_idx; idx<=end_idx; idx++)
        //         subarray.add(A.get(idx));
        //         return subarray;
        //     }
        //     end_idx++;
        // }
        // return new ArrayList<>(Arrays.asList(-1));
        HashMap<Long, Integer> prefixSumHashMap = new HashMap<>();
        int sum = 0;
        for (int idx = 0; idx < A.size(); idx++) {
            sum += A.get(idx);
            if(sum==B)    return new ArrayList<>(A.subList(0, idx+1));
            if(prefixSumHashMap.containsKey((long)sum - B))    return new ArrayList<>(A.subList(prefixSumHashMap.get((long)sum - B)+1, idx+1));
            prefixSumHashMap.put((long)sum, idx);
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
}
