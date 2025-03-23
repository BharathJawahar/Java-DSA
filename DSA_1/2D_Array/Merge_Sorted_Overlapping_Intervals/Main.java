import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(10,  20)),
            new ArrayList<>(Arrays.asList(20,  40)),
            new ArrayList<>(Arrays.asList(35,  100)),
            new ArrayList<>(Arrays.asList(90,  91)),
            new ArrayList<>(Arrays.asList(100, 200))
        ));
        System.out.println("Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        arrayList = mergeOverlappingArray((arrayList));
        System.out.println("Merged Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
    
    public static ArrayList<ArrayList<Integer>> mergeOverlappingArray(ArrayList<ArrayList<Integer>> arrayList) {
        int i=0;
        while(i<arrayList.size()-1) {
            if(arrayList.get(i+1).get(0)<=arrayList.get(i).get(1)) {
                arrayList.get(i).set(1, Math.max(arrayList.get(i+1).get(1), arrayList.get(i).get(1)));
                arrayList.remove((i+1));
            }
            else i++;
        }
        return arrayList;
    }
}
