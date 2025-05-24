// Merge Two Sorted Arrays
// Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
// Note: A linear time complexity is expected and you should avoid use of any library function.

import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        System.out.println(mergeSortedArray(new ArrayList<>(Arrays.asList(4, 7, 9)), new ArrayList<>(Arrays.asList(2, 11, 19))));
        System.out.println(mergeSortedArray(new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(2))));
    }
    public static ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        int i = 0, j = 0;
        while(i<A.size() && j<B.size()) {
            if(A.get(i)<=B.get(j)) {
                sortedArrayList.add(A.get(i));
                i++;
            }
            else {
                sortedArrayList.add(B.get(j));
                j++;
            }
        }
        for(;i<A.size();i++)    sortedArrayList.add(A.get(i));
        for(;j<B.size();j++)    sortedArrayList.add(B.get(j));
        return sortedArrayList;
    }
}