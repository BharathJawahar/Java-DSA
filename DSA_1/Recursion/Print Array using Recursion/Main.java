
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        PrintArray(arrayList);
    }
    public static void PrintArray(ArrayList<Integer> arrayList) {
        recursivePrint(arrayList, 0);
    }
    public static void recursivePrint(ArrayList<Integer> arrayList, int i) {
        if(i<arrayList.size()) {
            System.out.print(arrayList.get(i) + " ");
            recursivePrint(arrayList, i+1);
        }
    }
}
