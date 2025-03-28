public class Main {
    public static void main(String[] args) {
        int n = 123344;
        System.out.println(SumOfDigits(n));
    }
    public static int SumOfDigits(int n) {
        if(n==0) return 0;
        return n%10 + SumOfDigits(n/10);
    }
}
