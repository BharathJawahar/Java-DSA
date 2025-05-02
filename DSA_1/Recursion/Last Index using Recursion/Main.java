// You are given an array A of size N. Write a recursive function that returns the last index at which an integer B is found in the array.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(LastIndex(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8)),5));        
        System.out.println(LastIndex(new ArrayList<>(Arrays.asList(1,2,3,4,1,6,7,5)),5));        
        System.out.println(LastIndex(new ArrayList<>(Arrays.asList(5,2,3,4,1,6,7,5)),5));        
        System.out.println(LastIndex(new ArrayList<>(Arrays.asList(1,2,3,4,1,6,7,0)),5));        
    }
    public static int LastIndex(ArrayList<Integer> A, int B) {
        return LastIndexRecursive(A, B, A.size()-1);
    }
    public static int LastIndexRecursive(ArrayList<Integer> A, int B, int index) {
        if(index < 0)    return -1;
        if(A.get(index) == B)    return index;
        return (LastIndexRecursive(A, B, index-1));
    }
}
