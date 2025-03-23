
public class Main {
    public static void main(String[] args) {
        System.out.println(strangeEquality(5));
    }
    private static int strangeEquality(int a) {
        int b = a, ith_bit = 0, x = 0;
        while(b>0) {
            b = b>>1;
            ith_bit++;
        }
        System.err.println(a + " : " + Integer.toBinaryString(a));
        System.err.println("Bit " + ith_bit + " is set");
        for (int i = 32-ith_bit+1; i < 32; i++){
            if(((1<<(31-i))&a)==0)   x = x|(1<<(31-i));
        }
        int y = (1<<(ith_bit));
        System.err.println("X : " + x + "(" + Integer.toBinaryString(x)+")");
        System.err.println("Y : " + y + "(" + Integer.toBinaryString(y)+")");
        return x^y;
    }
}

