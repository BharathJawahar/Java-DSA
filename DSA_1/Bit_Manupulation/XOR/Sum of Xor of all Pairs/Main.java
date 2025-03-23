
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 1,2 ,2));
        System.out.println(xorOfAllPairs(arrayList));
    }
    public static int xorOfAllPairs(ArrayList<Integer> arrayList) {
        ArrayList<Integer> xor_of_pair = new ArrayList<>();
        int sum_of_xor = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size(); j++) {
                    int temp = arrayList.get(i) ^ arrayList.get(j);
                    xor_of_pair.add(temp);
            }   
        }
        // System.out.print(xor_of_pair);
        for (Integer i : xor_of_pair) {
            sum_of_xor = (sum_of_xor + i) % 1000000007;
        }
        return sum_of_xor;
    }
}
