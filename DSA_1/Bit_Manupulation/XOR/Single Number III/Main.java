import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(186,256,102,377,186,377));
        System.out.print(singleNumberIII(arrayList));
    }
    
    public static ArrayList<Integer> singleNumberIII(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayListAns = new ArrayList<>();
        int xor = 0, xor_set_bit = 0;
        for(Integer i : arrayList) {
            xor ^= i;
        }
        // System.err.println("XOR : " + xor + "\nBit : " + Integer.toBinaryString(xor));
        for (int i = 0; i < 32; i++) {
            if((xor&(1<<i))!=0){
                // System.err.println((xor&(1<<i)));
                xor_set_bit = i;
                break;
            }
        }
        // System.err.println("XOR set bit : " + xor_set_bit);
        int xor_1 = 0, xor_0 = 0;
        for(Integer i : arrayList) {
            if((i&(1<<xor_set_bit))==0) {
                xor_0 ^= i;
            }
            else {
                xor_1 ^= i;
            }
        }
        // System.err.println("Integer 1 : " + xor_0);
        // System.err.println("Integer 2 : " + xor_1);
        arrayListAns.add(Math.min(xor_0, xor_1));
        arrayListAns.add(Math.max(xor_0, xor_1));
        return arrayListAns;
    }
}