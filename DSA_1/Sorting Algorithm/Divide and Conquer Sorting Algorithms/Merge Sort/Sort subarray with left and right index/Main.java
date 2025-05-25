// You are given an array A of integers of length N and two indices, B and C.
// Your task is to sort the subarray [B, C] within the given array. The rest of the array should remain unchanged.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortSubarray(new ArrayList<>(Arrays.asList(59, 11, 8, 91, 49, 44, 8)), 4, 6));
        System.out.println(sortSubarray(new ArrayList<>(Arrays.asList(50, 40, 30, 20, 10)), 0, 3));
    }
    public static ArrayList<Integer> sortSubarray(ArrayList<Integer> A, int B, int C) {
        if (B >= C) return A;
        int mid = (B+C)/2;
        sortSubarray(A, B, mid);
        sortSubarray(A, mid+1, C);
        merge(A, B, mid, C);
        return A;
    }
    public static void merge(ArrayList<Integer> A, int B, int mid, int C) {
        int i = B, j = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=C) {
            if(A.get(i)<=A.get(j)) {
                temp.add(A.get(i));
                i++;
            }
            else {
                temp.add(A.get(j));
                j++;
            }
        }
        for(;i<=mid;i++)    temp.add(A.get(i));
        for(;j<=C;j++)     temp.add(A.get(j));
        for(int idx=0; idx<temp.size(); idx++) {
            A.set(idx+B, temp.get(idx));
        }
    }
}
