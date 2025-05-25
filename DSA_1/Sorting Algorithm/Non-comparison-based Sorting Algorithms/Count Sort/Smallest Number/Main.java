
import java.util.ArrayList;
import java.util.Arrays;

// An integer is given to you in the form of an array, with each element being a separate digit.
// Find the smallest number (leading zeroes are allowed) that can be formed by rearranging the digits of the given number in an array. Return the smallest number in the form an array.

public class Main {
    public static void main(String[] args) {
        System.out.println(countSort(new ArrayList<>(Arrays.asList(6, 3, 4, 2, 7, 2, 1))));
        System.out.println(countSort(new ArrayList<>(Arrays.asList(4, 2, 7, 3, 9, 0))));
    }
    public static ArrayList<Integer> countSort(ArrayList<Integer> A) {
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        int[] freq = new int[10];
        for(Integer i : A) {
            freq[i]++;
        }
        for(int i=0; i<10; i++) {
            for(int j=0; j<freq[i]; j++) {
                sortedArrayList.add(i);
            }
        }
        return sortedArrayList;
    }
}
