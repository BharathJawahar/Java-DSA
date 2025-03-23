import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int counter = 10;
        for(int i=0; i<5; i++) {
            ArrayList<Integer> tempArrayList = new ArrayList<>();
            for(int j=0; j<10; j++) {
                tempArrayList.add(counter);
            }
            arrayList.add(tempArrayList);
        }
        System.out.println("Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Prefix Array:");
        arrayList = prefixSum((arrayList));
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // System.out.println(prefixSum(arrayList));
    }
    
    public static ArrayList<ArrayList<Integer>> prefixSum(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> prefixArrayList = new ArrayList<>();
        int no_of_row = A.size(), no_of_column = A.get(0).size();
        // Add Padding
        for(int i=0; i<no_of_row+1; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<no_of_column+1; j++) {
                temp.add(0);
            }
            prefixArrayList.add(temp);
        }
        // Calulate Prefix
        for(int i=0; i<no_of_row; i++) {
            for(int j=0; j<no_of_column; j++) {
                int sum = A.get(i).get(j) + prefixArrayList.get(i).get(j+1) + prefixArrayList.get(i+1).get(j) - prefixArrayList.get(i).get(j);
                prefixArrayList.get(i+1).set(j+1, sum);
            }
        }
        return prefixArrayList;
    }
}
