
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 1,2 ,2));
        System.out.println(checkExtraInteger(arrayList));
    }
    public static int checkExtraInteger(ArrayList<Integer> arrayList) {
        int xor = 0;
        for (Integer i : arrayList) {
            xor = xor ^ i;
        }
        return xor;
    }
}
