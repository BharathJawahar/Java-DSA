
// Scooby calls a positive integer special if it is divisible by B and it is divisible by C. You need to tell the number of special integers less than or equal to A.


public class Main {
    public static void main(String[] args) {
        System.out.println(solve(12, 3, 2));
        System.out.println(solve(6, 1, 4));
    }
    public static int solve(int A, int B, int C) {
        int lcm = B*C/gcd(Math.max(B,C),Math.min(B,C));
        return A/lcm;
    }
    public static int gcd(int A, int B) {
        while(B!=0) {
            int b = B;
            B = A%B;
            A = b;
        }
        return A;
    } 
}