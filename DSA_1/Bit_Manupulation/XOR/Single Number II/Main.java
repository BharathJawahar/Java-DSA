import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,6));
        System.out.print(singleNumberII(arrayList));
    }
    
    public static int singleNumberII(ArrayList<Integer> arrayList) {
        int bit_count[] = new int[32], ans = 0;
        // Initialize all values as 0
        for(int i=0; i<32; i++) {
            bit_count[i]=0;
        }
        // Count all bit 
        for(Integer x : arrayList) {
            // System.err.println(x + " " + Integer.toBinaryString(x));
            for(int j=0; j<32; j++) {
                if((x&1)==1)    bit_count[j]++;
                x = (x>>1);
            }
            for(int j=0; j<32; j++) {
                // System.err.print(bit_count[j]);
            }
            // System.err.println();
        }
        // System.err.println();
        //If bit count is not multiple of 3, set that bit in ans
        for(int j=0; j<32; j++) {
            if(bit_count[j]%3!=0) {
                // System.err.println(ans + " " + Integer.toBinaryString(ans));
                ans  = (ans | (1<<j));
                // System.err.println(ans + " " + Integer.toBinaryString(ans));
            }
        }
        return ans;
    }
}