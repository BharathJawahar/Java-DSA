import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(5);
        int counter = 0;
        for(int i=0; i<6; i++) {
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
        printSprial(arrayList);
        // System.out.println(printSprial(arrayList, 12));
    }
    
    public static void printSprial(ArrayList<ArrayList<Integer>> A) {
        int left = 0, top = 0, right = A.get(0).size()-1, bottom = A.size()-1;
        while(left<=right && top<=bottom) {
            for(int i=left; i<=right; i++)
                System.out.print(A.get(top).get(i) + " ");
            for(int i=top+1; i<bottom; i++)
                System.out.print(A.get(i).get(right) + " ");
            for(int i=right; i>=left && top<bottom; i--)
                System.out.print(A.get(bottom).get(i) + " ");
            for(int i=bottom-1; i>top && left<right; i--)
                System.out.print(A.get(i).get(left) + " ");
            left++; right--;
            top++; bottom--;
        }
    }
}
