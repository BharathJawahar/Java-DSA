// Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
// Since the answer may be large, return the answer modulo (109 + 7).
// Note: Ensure to handle integer overflow when performing the calculations.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(93,9,46,79,56,24,10,26,9,93,31,93,75,7,4,80,19,67,49,84,62,100,17,40,35,84,14,81,99,31,100,66,70,2,11,84,60,89,13,57,47,60,59,60,42,67,89,29,85,83,42,47,66,80,88,85,83,82,16,23,21,55,26,2,21,92,85,26,46,3,7,95,50,22,84,52,57,44,4,23,25,55,41,49)), 37));
    }   
    public static int solve(ArrayList<Integer> A, int B) {
        long ans = 0;
        int[] freq = new int[B];
        for(int i=0; i<A.size(); i++) {
            int rem = A.get(i)%B;
            if(rem<0) rem+=B;
            freq[rem]++;
        }
        ans += ((long)freq[0]*(freq[0]-1))/2;
        if((B&1)==1)
            for(int i=1; i<=B/2; i++) {
                ans += ((long)freq[i]*freq[B-i]);
            }
        else {
            for(int i=1; i<B/2; i++) {
                ans += ((long)freq[i]*freq[B-i]);
            }
            ans += ((long)freq[B/2] * ((long)freq[B/2]-1))/2;
        }
        return (int)(ans%1000000007);
    } 
}
