// Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)], if we split the array into some number of "chunks" (partitions), and individually sort each chunk. After concatenating them in order of splitting, the result equals the sorted array.
// What is the most number of chunks we could have made?

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxChunk(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 0))));
        System.out.println(maxChunk(new ArrayList<>(Arrays.asList(2, 0, 1, 3))));
    }
    public static int maxChunk(ArrayList<Integer> A) {
        int count = 0, max = A.get(0);
        for(int i=0; i<A.size(); i++) {
            max = Math.max(max, A.get(i));
            if(max==i) {
                count++;
            }
        }
        return count;
    }
}
