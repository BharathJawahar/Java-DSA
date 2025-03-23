import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(5);
        System.out.println("Array");
        for(int i=0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " \t");
        }
        System.out.println();
        System.out.println(minSwap(arrayList, 8));
    }
        
    private static int minSwap(ArrayList<Integer> arrayList, int x) {
        int min_swap = 0, no_of_values_below_x=0;
        for(int i=0; i<arrayList.size(); i++) {
            if(arrayList.get(i)<=x)    no_of_values_below_x++;
        }
        if(no_of_values_below_x<=1)   return min_swap;
        for(int i=0; i<no_of_values_below_x; i++) {
            if(arrayList.get(i)>x)     min_swap++;
        }
        int swap = min_swap;
        for(int i=0, j=no_of_values_below_x-1; j<arrayList.size(); i++, j++) {
            if(arrayList.get(i)<=x) swap++;
            if(arrayList.get(j)<=x) swap--;
            min_swap = Math.min(swap, min_swap);
        }
        return min_swap;
    }   
}
