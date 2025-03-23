import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int counter = 0;
        for(int i=0; i<5; i++) {
            ArrayList<Integer> tempArrayList = new ArrayList<>();
            for(int j=0; j<10; j++) {
                tempArrayList.add(counter++);
            }
            arrayList.add(tempArrayList);
        }
        System.out.println("Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println(solve(arrayList, 12));
    }
    
    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int right = A.get(0).size(), bottom = A.size(), row = 0, column = right-1;
        while(row<bottom && 0<=column) {
            int x = A.get(row).get(column);
            if(x==B) {
                System.out.println(B + " == " + x);
                return 1;
            }
            if(B<x) {
                column--;
                System.out.println(B + " < " + x);
            }
            else {
                row++;
                System.out.println(B + " > " + x);
            }

        }
        return -1;
    }
}
