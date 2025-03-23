import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(10,  20)),
            new ArrayList<>(Arrays.asList(30,  40)),
            new ArrayList<>(Arrays.asList(45,  100)),
            new ArrayList<>(Arrays.asList(105,  110)),
            new ArrayList<>(Arrays.asList(116, 200))
        ));
        ArrayList<Integer> newArraylist = new ArrayList<>(Arrays.asList(21, 30));
    
        System.out.println("Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        arrayList = mergeAndInsertOverlappingArray(arrayList, newArraylist);
        System.out.println("Merged Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
    
    public static ArrayList<ArrayList<Integer>> mergeAndInsertOverlappingArray(ArrayList<ArrayList<Integer>> arrayList, ArrayList<Integer> newArrayList) {
        int i=0, inserted = -1;
        while(i<arrayList.size() && inserted==-1) {
            if(newArrayList.get(0)<=arrayList.get(i).get(0))    {
                arrayList.add(i, newArrayList);
                inserted = i;
            }
            else i++;
        }
        System.out.println(arrayList);

        if(inserted==-1) {
            arrayList.add(newArrayList);
            inserted = i;
        }
        for(i=0; i<arrayList.size()-1; i++) {
            if(arrayList.get(i).get(1)>=arrayList.get(i+1).get(0)) {
                arrayList.get(i).set(1, Math.max(arrayList.get(i).get(1), arrayList.get(i+1).get(1)));
                arrayList.remove(i+1);
                System.out.println(arrayList);
                i--;
        }
        }
        return arrayList;
    }
}
