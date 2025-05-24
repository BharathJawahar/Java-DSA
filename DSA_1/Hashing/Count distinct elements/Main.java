// Given an array A of N integers, return the number of unique elements in the array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(countUnique(new ArrayList<>(Arrays.asList(3, 4, 3, 6, 6))));
        System.out.println(countUnique(new ArrayList<>(Arrays.asList(3, 3, 3, 9, 0, 1, 0))));
    }
    public static int countUnique(ArrayList<Integer> A) {
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i : A) {
            hs.add(i);
        }
        return hs.size();
    }
}
