
import java.util.ArrayList;
import java.util.Arrays;

// Given an Array of integers B, and a target sum A.
// Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.

public class Main {
    public static void main(String[] args) {
        System.out.println(pairSum(8,  new ArrayList<>(Arrays.asList(3, 5, 1, 2, 1, 2))));
        System.out.println(pairSum(21, new ArrayList<>(Arrays.asList(9, 10, 7, 10, 9, 1, 5, 1, 5))));
    }
    public static int pairSum(int A, ArrayList<Integer> B) {
        for(int i=0; i<B.size(); i++) {
            for(int j=i+1; j<B.size(); j++) {
                if(B.get(i)+B.get(j)==A)    return 1;
            }
        }
        return 0;
    }
}
