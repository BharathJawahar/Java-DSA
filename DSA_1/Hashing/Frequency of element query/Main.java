// Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner, and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(freq(new ArrayList<>(Arrays.asList(1, 2, 1, 1)), new ArrayList<>(Arrays.asList(1, 2))));
        System.out.println(freq(new ArrayList<>(Arrays.asList(2, 5, 9, 2, 8)), new ArrayList<>(Arrays.asList(3, 2))));
    }
    public static ArrayList<Integer> freq(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer i : A) {
            if(freq.containsKey(i))    freq.put(i, freq.get(i)+1);
            else     freq.put(i, 1);
        }
        for (Integer i : B) {
            ans.add(freq.getOrDefault(i, 0));
        }
        return ans;
    }
}
