
import java.util.ArrayList;
import java.util.Arrays;

// Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.

public class Main {
    public static void main(String[] args) {
        System.out.println(countSort(new ArrayList<>(Arrays.asList(1, 3, 1))));
        System.out.println(countSort(new ArrayList<>(Arrays.asList(4, 2, 1, 3))));
    }
    public static ArrayList<Integer> countSort(ArrayList<Integer> A) {
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        int max = A.get(0);
        for(Integer i : A) {
            max = Math.max(i, max);
        }
        int[] freq = new int[max+1];
        for(Integer i : A) {
            freq[i]++;
        }
        for(int i=0; i<=max; i++) {
            for(int j=0; j<freq[i]; j++) {
                sortedArrayList.add(i);
            }
        }
        return sortedArrayList;
    }
}
