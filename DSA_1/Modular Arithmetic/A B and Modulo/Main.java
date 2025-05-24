//Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.

public class Main {
    public static void main(String[] arg) {
        System.out.println(modulo(1, 2));
        System.out.println(modulo(5, 10));
    }
    public static int modulo(int A, int B) {
        return Math.abs(A-B);
    }
}
