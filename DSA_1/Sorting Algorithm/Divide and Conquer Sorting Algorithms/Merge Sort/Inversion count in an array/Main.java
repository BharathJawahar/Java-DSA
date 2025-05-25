// Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static long inversionCount;
    public static void main(String[] args) {
        inversionCount = 0;
        inversionCount(new ArrayList<>(Arrays.asList(1, 3, 2)));
        System.out.println(inversionCount);
        inversionCount = 0;
        inversionCount(new ArrayList<>(Arrays.asList(3, 4, 1, 2)));
        System.out.println(inversionCount);
    }
    public static void inversionCount(ArrayList<Integer> A) {
        mergeSort(A,0, A.size()-1);
    }
    public static void mergeSort(ArrayList<Integer> A, int start, int end) {
        if(start>=end)    return;
        int mid = (start+end)/2;
        mergeSort(A, start, mid);
        mergeSort(A, mid+1, end);
        merge(A, start, mid+1, end);
    }
    public static void merge(ArrayList<Integer> A, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = start, j = mid;
        while(i<mid && j<=end) {
            if(A.get(i)<=A.get(j)) {
                temp.add(A.get(i));
                i++;
            }
            else {
                inversionCount = (inversionCount + (mid-i)) % 1000000007;
                temp.add(A.get(j));
                j++;
            }
        }
        for(;i<mid;i++)     temp.add(A.get(i));
        for(;j<=end;j++)    temp.add(A.get(j));

        for(int idx=0; idx<temp.size(); idx++) {
            A.set(idx+start, temp.get(idx));
        }
    }
}
