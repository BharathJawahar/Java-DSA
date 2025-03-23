public class Main {
    public static void main(String[] args) {
        System.out.println(unsetBitsFromRight(10, 3));
    }    
    public static int unsetBitsFromRight(int x, int n) {
        return ((x>>n)<<n);
    }
}
