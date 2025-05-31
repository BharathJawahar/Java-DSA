// Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.
// If a number has no tens digit, we can assume value to be 0.
// If 2 numbers have same tens digit, in that case number with max value will come first
// Solution should be based on comparator.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(tenDigitSort(new ArrayList<>(Arrays.asList(15, 11, 7, 19))));
        System.out.println(tenDigitSort(new ArrayList<>(Arrays.asList(2, 24, 22, 19))));
    }
    public static ArrayList<Integer> tenDigitSort(ArrayList<Integer> A) {
        A.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(tenthDigit(a)<tenthDigit(b))    return -1;
                if(tenthDigit(a)>tenthDigit(b))    return 1;
                if(a>b)    return -1;
                if(a<b)    return 1;
                return 0;
            }
        });
        return A;
    }
    public static int tenthDigit(int a) {
        return (a/10)%10;
    }
}
