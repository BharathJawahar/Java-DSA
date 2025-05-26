// Given an integer array A, sort the array using Quick Sort.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(quickSort(new ArrayList<Integer>(Arrays.asList(1, 4, 10, 2, 1, 5))));
        System.out.println(quickSort(new ArrayList<Integer>(Arrays.asList(1, 3, 7))));
    }
    public static ArrayList<Integer> quickSort(ArrayList<Integer> A) {
        quickSort(A, 0, A.size()-1);
        return A;
    }
    public static void quickSort(ArrayList<Integer> A, int start, int end) {
        if(start>=end)    return;
        int i = start-1, j = start;
        for(int idx=start; idx<end; idx++) {
            if(A.get(idx)<A.get(end)) {
                i++;
                int temp = A.get(i);
                A.set(i, A.get(idx));
                A.set(idx, temp);
            }
        }
        i++;
        int temp = A.get(i);
        A.set(i, A.get(end));
        A.set(end, temp);
        quickSort(A, start, i-1);
        quickSort(A, i+1, end);
    }
}