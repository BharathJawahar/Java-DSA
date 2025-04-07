// Given an array of integers A with N elements and a target integer B, the task is to find all the indices at which B occurs in the array.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 4, 4, 5, 6, 7, 4, 4, 7, 8, 8));
        System.out.print(allIndices(arrayList, 4));
    }
    public static ArrayList<Integer> allIndices(ArrayList<Integer> arrayList, int n) {
        ArrayList<Integer> index = new ArrayList<>();
        recursive_allIndices(arrayList, 0, n,  index);
        return index;
    }
    public static void recursive_allIndices(ArrayList<Integer> arrayList, int i, int n, ArrayList<Integer> index) {
        if(i>=arrayList.size())    return;
        if(arrayList.get(i)==n)    index.add(i);
        recursive_allIndices(arrayList, i+1, n, index);
    }
}
