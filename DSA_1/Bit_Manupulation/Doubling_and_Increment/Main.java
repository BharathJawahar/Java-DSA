public class Main {
    public static void main(String args[]) {
        System.out.println(double_and_increment(10));
    }
    public static int double_and_increment(int x) {
        int count = 0;
        while(x>0) {
            if((x&1)==1)   count++;
            x = x>>1;
        }
        return  count;
    }
}