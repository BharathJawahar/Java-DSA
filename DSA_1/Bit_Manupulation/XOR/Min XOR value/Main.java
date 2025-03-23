
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 2, 5, 7));
        System.out.println(minXORvalue(arrayList));        
    }

    private static int minXORvalue(ArrayList<Integer> arrayList) {
        int min_xor = Integer.MAX_VALUE;
        arrayList.sort(null);
        for (int i = 0; i < arrayList.size()-1; i++) {
            int xor = arrayList.get(i)^arrayList.get(i+1);
            // System.out.println("XOR of " + arrayList.get(i) + " " + arrayList.get(j) + " = " + xor);
            min_xor = Math.min(min_xor, xor);
            if(min_xor==0)    return 0;
        }
        return min_xor;
    }    
}
