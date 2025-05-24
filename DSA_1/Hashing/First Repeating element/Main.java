
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Given an integer array A of size N, find the first repeating element in it.
// We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
// If there is no repeating element, return -1.

public class Main {
    public static void main(String[] args) {
        System.out.println(firstRepeatingElement(new ArrayList<>(Arrays.asList(10, 5, 3, 4, 3, 5, 6))));
        System.out.println(firstRepeatingElement(new ArrayList<>(Arrays.asList(6, 10, 5, 4, 9, 120))));
    }
    public static int firstRepeatingElement(ArrayList<Integer> A) {
        HashSet<Integer> allElementHashSet = new HashSet<>(), repeatingElementHashSet = new HashSet<>();
        for(Integer i : A) {
            if(allElementHashSet.contains(i))    repeatingElementHashSet.add(i);
            else    allElementHashSet.add(i);
        }
        for(int i=0; i<A.size(); i++) {
            if(repeatingElementHashSet.contains(A.get(i)))    return A.get(i);
        }
        return -1;
    }
}
