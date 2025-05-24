// You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
// Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(distinctNumber(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3)), 3));
        System.out.println(distinctNumber(new ArrayList<>(Arrays.asList(1, 1, 2, 2)), 1));
    }
    public static ArrayList<Integer> distinctNumber(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> distinctNumberHashMap  = new HashMap<>();
        ArrayList<Integer> distinctNumberArrayList  = new ArrayList<>();
        for(int i=0; i<B; i++) {
            distinctNumberHashMap.put(A.get(i), distinctNumberHashMap.getOrDefault(A.get(i), 0)+1);
        }
        distinctNumberArrayList.add(distinctNumberHashMap.size());
        for(int i=B; i<A.size(); i++) {
            distinctNumberHashMap.put(A.get(i-B), distinctNumberHashMap.get(A.get(i-B))-1);
            if(distinctNumberHashMap.get(A.get(i-B))==0)     distinctNumberHashMap.remove(A.get(i-B));
            distinctNumberHashMap.put(A.get(i), distinctNumberHashMap.getOrDefault(A.get(i), 0)+1);
            distinctNumberArrayList.add(distinctNumberHashMap.size());
        }
        return distinctNumberArrayList;
    }
}
