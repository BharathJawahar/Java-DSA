// Given an array of integers A, sort the array into a wave-like array and return it.
// In other words, arrange the elements into a sequence such that
// a1 >= a2 <= a3 >= a4 <= a5..... 
// NOTE: If multiple answers are possible, return the lexicographically smallest one.

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(waveSort(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        System.out.println(waveSort(new ArrayList<>(Arrays.asList(1, 2))));
    }
    public static ArrayList<Integer> waveSort(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0; i<A.size()-1; i+=2) {
            int temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
        }
        return A;
    }
}
