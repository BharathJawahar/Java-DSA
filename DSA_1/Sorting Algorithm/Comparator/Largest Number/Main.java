// Given an array A of non-negative integers, arrange them such that they form the largest number.
// Note: The result may be very large, so you need to return a string instead of an integer.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(largestNumber(new ArrayList<Integer>(Arrays.asList(3, 30, 34, 5, 9))));
        System.out.println(largestNumber(new ArrayList<Integer>(Arrays.asList(2, 3, 9, 0))));
        System.out.println(largestNumber(new ArrayList<Integer>(Arrays.asList(9,99,999,9999,9998))));
        
    }
    public static String largestNumber(ArrayList<Integer> A) {
        boolean allZero = true;
        for (int num : A) {
            if (num != 0) {
                allZero = false;
                break;
            }
        }
        if(allZero)    return "0";
        A.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String ab = Integer.toString(a) + Integer.toString(b), ba = Integer.toString(b) + Integer.toString(a);
                if(Integer.parseInt(ab)>Integer.parseInt(ba)) return -1;
                if(Integer.parseInt(ba)>Integer.parseInt(ab)) return 1;
                return 0;
            }
        });
        String largestNumber = "";
        for(Integer i : A)    largestNumber = largestNumber.concat(String.valueOf(i));
        // if(Long.parseLong(largestNumber)==0)    largestNumber="0";
        return largestNumber;
    }
}
