public class Main {
    public static void main(String[] args) {
        System.out.print(set_bit(2,2));    
    }
    public static int set_bit(int a, int b) {
        return  (0 | (1<<a) | (1<<b));
    }
}
