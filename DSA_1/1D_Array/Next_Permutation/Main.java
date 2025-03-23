
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(4, 4, 5, 7, 4, 4, 3, 3, 1, 1));
        System.out.println("Initial Array " + arrayList);
        nextPermutation(arrayList);
    }
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arrayList) {
        int n = arrayList.size(), sorted_index = n-1;
        for(int i=n-1; 0<i ; i--) {
            if(arrayList.get(i-1)>=arrayList.get(i)) {
                sorted_index = i-1;
            }
            else    break;
        }
        System.out.println("Array is sorted till index " + sorted_index + " : " + arrayList.get(sorted_index) );
        if(sorted_index!=0) {
            for(int i=n-1; sorted_index<=i; i--) {
                if(arrayList.get(sorted_index-1)<arrayList.get(i)) {
                    int temp = arrayList.get(sorted_index-1);
                    arrayList.set(sorted_index-1, arrayList.get(i));
                    arrayList.set(i, temp);
                    break;
                }
            }
        }
        else sorted_index = 0;
        System.out.println("After swapping " + arrayList);
        int i = sorted_index, j = n-1;
        while(i<j) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
            i++; j--;
        }
        System.out.println("Final Array " + arrayList);
        return  arrayList;    }
}
