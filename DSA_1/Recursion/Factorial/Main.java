public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.print(factorial(n));
    }
    public static int factorial(int n) {
        if(n==0)    return 1;
        return n*factorial(n-1);
    }
}
