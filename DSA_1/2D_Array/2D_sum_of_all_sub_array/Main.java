import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int counter = 1;
        for(int i=0; i<2; i++) {
            ArrayList<Integer> tempArrayList = new ArrayList<>();
            for(int j=0; j<2; j++) {
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
        System.out.println(sumOfAllSubarray(arrayList));
        // System.out.println(prefixSum(arrayList));
    }
    
    public static int sumOfAllSubarray(ArrayList<ArrayList<Integer>> A) {
        int sum = 0, no_of_row = A.size(), no_of_column = A.get(0).size();
        for(int i=0; i<no_of_row; i++) {
            for(int j=0; j<no_of_column; j++) {
                int x = A.get(i).get(j);
                System.out.println((x*(i+1)*(j+1)));
                sum += (x*(i+1)*(j+1)) + (x*(i+1)*(no_of_column-j+1)) + (x*(no_of_row-i+1)*(no_of_column-j+1)) + (x*(no_of_row-i+1)*(j+1));

            }
        }
        return sum;
    }
}
