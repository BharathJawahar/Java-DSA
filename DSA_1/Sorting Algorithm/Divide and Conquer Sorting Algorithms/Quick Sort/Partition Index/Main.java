
import java.util.ArrayList;
import java.util.Arrays;

// Given an integer array A of length N, considering the last element as pivot p, rearrange the elements such that for all i:
// if A[i] < p then it should be present on left side of the partition
// if A[i] > p then it should be present on right side of the partition
// Rearrange the given array as well as return the partition index.
// 
// Note: All elements are distinct

public class Main {
    public static void main(String[] args) {
        System.out.println(partitionIndex(new ArrayList<>(Arrays.asList(6, 2, 0, 4, 5))));
    }
    public static int partitionIndex(ArrayList<Integer> A) {
        int i = -1;
        for(int j=0; j<A.size(); j++) {
            if(A.get(j)<A.get(A.size()-1)) {
                i++;
                if(i!=j) {
                    int temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }
        }
        int temp = A.get(++i);
        A.set(i, A.get(A.size()-1));
        A.set(A.size()-1, temp);
        // System.out.println(A);
        return i;
    }
}
