
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// You are given an array A of N integers and an integer B.
// Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

// Since the answer can be very large, return the remainder after dividing the count with 10^9+7.

public class Main {
    public static void main(String[] args) {
        System.out.println(countPair(new ArrayList<>(Arrays.asList(3, 5, 1, 2)), 4));
        System.out.println(countPair(new ArrayList<>(Arrays.asList(1, 2, 1, 2)), 1));
    }

    private static int countPair(ArrayList<Integer> A, int B) {
        int count = 0;
        HashMap<Integer, Integer> freHashMap = new HashMap<>(); 
        for(Integer i : A)    freHashMap.put(i, freHashMap.getOrDefault(i, 0)+1);
        for(Integer i : A) {
            int k = i - B;
            count += freHashMap.getOrDefault(k, 0);
        }
        return count;
    }
}
