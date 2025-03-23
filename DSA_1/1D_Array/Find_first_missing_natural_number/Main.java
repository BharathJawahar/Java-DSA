import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,3,1,2));
        System.out.println("Array:");
        for (Integer element : arrayList) {
            System.out.print(element + "\t");
        }
        System.out.println();
        System.out.println();
        // arrayList = findFirstMissingInteger((arrayList));
        // System.out.println("Merged Array:");
        // for (Integer element : arrayList) {
            // System.out.print(element + "\t");
        // }
        System.out.println(findFirstMissingInteger(arrayList));
    }
    
    public static int findFirstMissingInteger(ArrayList<Integer> arrayList) {
        int i= 0, n = arrayList.size();
        while(i<n) {
            if(arrayList.get(i)==i+1)    i++;            
            else {
                if(0<arrayList.get(i) && arrayList.get(i)<=n) {
                    if(arrayList.get(arrayList.get(i)-1)!=arrayList.get(i)) {
                        int temp = arrayList.get(arrayList.get(i)-1);
                        arrayList.set(arrayList.get(i)-1, arrayList.get(i));
                        arrayList.set(i, temp);
                    }
                    else i++;
                }
                else i++;
            }
            System.out.println(arrayList);
        }
        for(i=0; i<n; i++) {
            if(arrayList.get(i)!=i+1)    return i+1;
        }
        return n+1;
    }
}
