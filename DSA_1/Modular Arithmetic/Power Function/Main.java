// Implement pow(A, B) % C.
// In other words, given A, B and C, Find (AB % C).
// Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.

public class Main {
    public static void main(String[] args) {
        System.out.println(pow(3, 3, 3));
    }
    public static int pow(int a, int b, int c) {
        if(b==0) return 1%c;
        int power = 1;
        int base = a%c;
        while(b>0) {
            if((b&1)==1)    power = (power*base) % c;
            base = (base*base) % c;
            b = (b>>1);
        }
        power = (power + c) % c;
        return power;
    }
}
