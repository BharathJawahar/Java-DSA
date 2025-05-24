// Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
// Each element in the result should appear as many times as it appears in both arrays.
// The result can be in any order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(commonList(new ArrayList<>(Arrays.asList(1, 2, 2, 1)), new ArrayList<>(Arrays.asList(2, 3, 1, 2))));
        System.out.println(commonList(new ArrayList<>(Arrays.asList(2, 1, 4, 10)), new ArrayList<>(Arrays.asList(3, 6, 2, 10, 10))));
    }
    public static ArrayList<Integer> commonList(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer i : A) {
            hashMap1.put(i, hashMap1.getOrDefault(i, 0)+1);
        }
        for(Integer i : B) {
            if(hashMap1.getOrDefault(i, 0)>0) {
                arrayList.add(i);
                hashMap1.put(i, hashMap1.get(i)-1);
            }
        }
        return arrayList;
    }
}
