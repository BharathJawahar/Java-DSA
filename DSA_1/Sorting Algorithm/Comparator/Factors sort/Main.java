// You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorSort(new ArrayList<>(Arrays.asList(6, 8, 9))));
        System.out.println(factorSort(new ArrayList<>(Arrays.asList(2, 4, 7))));
    }
    public static ArrayList<Integer> factorSort(ArrayList<Integer> A) {
        A.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                int x_factor = getFactorCount(x), y_factor = getFactorCount(y);
                if(x_factor<y_factor)    return -1;
                if(x_factor>y_factor)    return 1;
                if(x_factor==y_factor) {
                    if(x<y)    return -1;
                    if(x>y)    return 1;
                    if(x==y)    return 0;
                }
                return 0;
            }
        });
        return A;
    }
    public static int getFactorCount(int a) {
        int count = 0;
        for(int i=1; i<=a; i++) {
            if(a%i==0)   count++;
        }
        return count;
    }
}
