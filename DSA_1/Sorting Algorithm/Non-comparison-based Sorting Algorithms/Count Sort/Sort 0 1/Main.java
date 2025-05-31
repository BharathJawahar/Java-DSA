
import java.util.ArrayList;
import java.util.Arrays;

// Given an array A of 0s and 1s of length N. Sort this array.
// Note - Do not use any sorting algorithm or library's sort method.


public class Main {
    public static void main(String[] args) {
        System.out.println(sort01(new ArrayList<>(Arrays.asList(0,0,1,0,1,1,0))));
        System.out.println(sort01(new ArrayList<>(Arrays.asList(1,0))));
    }
    public static ArrayList<Integer> sort01(ArrayList<Integer> A) {
        int freq[] = new int[2];
        for(Integer i : A) {
            freq[i]++;
        }
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int i=0; i<freq[0]; i++) {
            sorted.add(0);
        }
        for(int i=0; i<freq[1]; i++) {
            sorted.add(1);
        }
        return sorted;
    }
}
