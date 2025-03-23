import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int counter = 0;
        for(int i=0; i<6; i++) {
            ArrayList<Integer> tempArrayList = new ArrayList<>();
            for(int j=0; j<10; j++) {
                tempArrayList.add(counter++);
            }
            arrayList.add(tempArrayList);
        }
        arrayList = printSprial(5);
        System.out.println("Array:");
        for (ArrayList<Integer> row : arrayList) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // System.out.println(printSprial(arrayList, 12));
    }
    
    public static ArrayList<ArrayList<Integer>> printSprial(int A) {
        int left = 0, top = 0, right = A-1, bottom = A-1, count=1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(A);
        for(int i=0; i<A; i++) {
            ArrayList<Integer> temp = new ArrayList<>(A);
            for(int j=0; j<A; j++) {
                temp.add(0);
            }
            ans.add(temp);
        }
        // System.out.println(ans.size());
        // System.out.println(ans.get(0).size());
        while(left<=right && top<=bottom) {
            for(int i=left; i<=right; i++, count++)
                ans.get(top).set(i, count*count);
            for(int i=top+1; i<bottom; i++, count++)
                ans.get(i).set(right, count*count);
            for(int i=right; i>=left && top<bottom; i--, count++)
                ans.get(bottom).set(i, count*count);
            for(int i=bottom-1; i>top && left<right; i--, count++)
                ans.get(i).set(left, count*count);
            left++; right--;
            top++; bottom--;
        }
        return ans;    
    }
}
