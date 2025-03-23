public class Main {
    public static void main(String[] args) {
        System.out.println(13);
        System.out.println(toggleBit(13, 1));
        System.out.println(Integer.toBinaryString(toggleBit(13, 1)));
    }
    private static int toggleBit(int x, int n) {
        return (x ^ (1<<(n-1)));
    }
}
