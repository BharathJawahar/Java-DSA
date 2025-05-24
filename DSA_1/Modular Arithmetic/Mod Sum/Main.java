// Given an array of integers A, calculate the sum of A [ i ] % A [ j ] for all possible i, j pairs. Return sum % (109 + 7) as an output.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1, 2, 3));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(17, 100, 11));
        System.out.println(modSum(A));
        System.out.println(modSum(B));
    }
    public static int modSum(ArrayList<Integer> A) {
        int sum = 0, freq[] = new int[1000];
        for (Integer i : A)    freq[i]++;
        for (Integer i : A) {
            for (Integer j : A) {
                sum+= ((freq[i]*freq[j])*(i%j))%1000000007;
            }
        }
        return sum;
    }
}
