// You are given an array A of size N. Write a recursive function that returns the first index at which an integer B is found in the array.
// 
// NOTE: If B is not found anywhere in the array then return -1.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstIndex(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8)),5));        
        System.out.println(FirstIndex(new ArrayList<>(Arrays.asList(1,2,3,4,1,6,7,5)),5));        
        System.out.println(FirstIndex(new ArrayList<>(Arrays.asList(5,2,3,4,1,6,7,5)),5));        
        System.out.println(FirstIndex(new ArrayList<>(Arrays.asList(1,2,3,4,1,6,7,0)),5));        
    }
    public static int FirstIndex(ArrayList<Integer> A, int B) {
        return FirstIndexRecursive(A, B, 0);
    }
    public static int FirstIndexRecursive(ArrayList<Integer> A, int B, int index) {
        if(A.size() == index)    return -1;
        if(A.get(index) == B)    return index;
        return (FirstIndexRecursive(A, B, index+1));
    }
}
