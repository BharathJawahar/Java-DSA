
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        towerOfHanoi(3);
    }
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        toh(A, 1, 3, ans);
        for (ArrayList<Integer> i : ans) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> toh(int a, int start, int end, ArrayList<ArrayList<Integer>> ans) {
        if(a == 1) {
            ans.add(new ArrayList<>(Arrays.asList(1, start, end)));
            return ans;
        }
        toh(a-1, start, 6-(start+end), ans);
        ans.add(new ArrayList<>(Arrays.asList(a, start, end)));
        toh(a-1, 6-(start+end), end, ans);
        return ans;
    }
}