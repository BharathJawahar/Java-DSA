
import java.util.ArrayList;
import java.util.Arrays;

// Sort by Color
// Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will represent the colors as,
// red -> 0
// white -> 1
// blue -> 2
// Note: Using the library sort function is not allowed.

public class Main {
    public static void main(String[] args) {
        System.out.println(countSort(new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2))));
        System.out.println(countSort(new ArrayList<>(Arrays.asList(0))));
    }
    
    public static ArrayList<Integer> countSort(ArrayList<Integer> A) {
        int[] freq = new int[3];
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        for(Integer i : A) {
            freq[i]++;
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<freq[i]; j++) {
                sortedArrayList.add(i);
            }
        }
        return sortedArrayList;
    }
}