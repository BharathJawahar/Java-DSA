// You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(countUnique(new ArrayList<>(Arrays.asList(3, 4, 3, 6, 6))));
        System.out.println(countUnique(new ArrayList<>(Arrays.asList(3, 3, 3, 9, 0, 1, 0))));
    }
    public static int countUnique(ArrayList<Integer> A) {
        int uniqueCount = 0;
        HashMap<Integer, Integer> freqHashMap = new HashMap<>();
        for(Integer i : A) {
            freqHashMap.put(i, freqHashMap.getOrDefault(i, 0)+1);
        }
        for(Integer i : A) {
            if(freqHashMap.get(i)==1)    uniqueCount++;
        }
        return uniqueCount;
    }
}
