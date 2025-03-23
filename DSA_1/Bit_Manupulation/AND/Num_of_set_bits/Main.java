public class Main {
    public static void main(String[] args) {
        System.out.println(numSetBits(1));
    }
    public static int numSetBits(int x) {
        int numSetBits = 0;
        while(x!=0) {
            if((x & 1) == 1)   numSetBits ++;
            x = x>>1;
        }
        return numSetBits;
    }
}
