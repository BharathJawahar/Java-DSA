// Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(deleteOne(new ArrayList<>(Arrays.asList(12, 15, 18))));
    }
    public static int deleteOne(ArrayList<Integer> A) {
        int[] preGCD = new int[A.size()], postGCD = new int[A.size()];
        int gcd = 0;
        for(int i = 0; i<A.size(); i++) {
            preGCD[i]  = arrayGCD(A, 0, i-1);
            postGCD[i] = arrayGCD(A, i+1, A.size);
        }
        return gcd;
    }
    public static int arrayGCD(ArrayList<Integer> A, int start, int end) {
        if(start==end)   return 0;
        if(start+1==end)   return A.get(start);
        int gcd = A.get(start);
        for(int i=start; i<=end; i++) {
            gcd = gcd(A.get(i), A())
        }
        return gcd;
    }
}