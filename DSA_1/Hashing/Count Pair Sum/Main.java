// You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j
// Since the answer can be very large, return the remainder after dividing the count with 109+7.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(countPair(new ArrayList<>(Arrays.asList(3, 5, 1, 2)), 8));
        System.out.println(countPair(new ArrayList<>(Arrays.asList(1, 2, 1, 2)), 3));
    }
    public static int countPair(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(Integer i : A) {
            int k = B - i;
            if(hm.containsKey(k))    count += hm.get(k);
            if(hm.containsKey(i))    hm.put(i, hm.get(i)+1);
            else   hm.put(i, 1);
        }
        return count%1000000007;
    }
}
