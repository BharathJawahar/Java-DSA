
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Interval> arrayList = new ArrayList<>();
        arrayList.add(new Interval(5, 8));
        arrayList.add(new Interval(31, 40));
        arrayList.add(new Interval(40, 41));
        arrayList.add(new Interval(42, 43));
        arrayList.add(new Interval(12, 15));
        arrayList.add(new Interval(10, 20));
        arrayList.add(new Interval(16, 30));
        arrayList.add(new Interval(3, 7));
        arrayList.add(new Interval(29, 30));
        for(Interval i : arrayList)
            System.out.println(i.start + " " + i.end);
        System.out.println();
        System.out.println(merge(arrayList));
        for(Interval i : arrayList)
            System.out.println(i.start + " " + i.end);

    }
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        sort1(intervals);
        for (int i = 0; i < intervals.size()-1; i++) {
            if(intervals.get(i).end>= intervals.get(i+1).start) {
                intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
                intervals.remove(i+1);
                i--;
            }
        }
        return  intervals;
    }
    private static void sort1(ArrayList<Interval> intervals){
        for(int i=0; i<intervals.size(); i++) {
            for(int j=0; j<intervals.size()-1-i; j++) {
                if(intervals.get(j).start>intervals.get(j+1).start) {
                    Interval temp = intervals.get(j);
                    intervals.set(j, intervals.get(j+1));
                    intervals.set(j+1, temp);
                }
            }
        }
    }
}
