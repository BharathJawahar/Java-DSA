public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(13));
        System.out.println(unset(13, 2));
        System.out.println(Integer.toBinaryString(unset(13, 2)));
    }
    private static int unset(int x, int n) {
        int mask = Integer.MAX_VALUE - (1<<n+1) + (1<<(n));
        return x & mask;
    }
}
