// Given an integer array A, sort the array using Merge Sort.

import java.util.ArrayList;
import java.util.Arrays;


public class Main{
    public static void main(String[] args) {
        System.out.println(mergeSort(new ArrayList<>(Arrays.asList(1, 4, 10, 2, 1, 5))));
        System.out.println(mergeSort(new ArrayList<>(Arrays.asList(3, 7, 1))));
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> A) {
        return mergeSort(A, 0, A.size()-1);
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> A, int start, int end) {
        if(start>=end)    return new ArrayList<>(Arrays.asList(A.get(start)));
        int mid = (start+end)/2;
        ArrayList<Integer> firstSortedArrayList = mergeSort(A, start, mid);
        ArrayList<Integer> lastSortedArrayList  = mergeSort(A, mid+1, end);
        ArrayList<Integer> sortedArrayList      = mergeSortedArray(firstSortedArrayList, lastSortedArrayList);
        return sortedArrayList;
    }
    public static ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        while(i<A.size() && j<B.size()) {
            if(A.get(i)<=B.get(j)) {
                sortedArrayList.add(A.get(i));
                i++;
            }
            else{
                sortedArrayList.add(B.get(j));
                j++;
            }
        }
        for(;i<A.size();i++)    sortedArrayList.add(A.get(i));
        for(;j<B.size();j++)    sortedArrayList.add(B.get(j));
        return sortedArrayList;
    }
}