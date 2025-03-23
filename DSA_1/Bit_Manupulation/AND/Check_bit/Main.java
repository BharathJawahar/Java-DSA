public class Main {
    public static void main(String[] args) {
        System.out.print(check_bit(10,0));    
    }
    public static int check_bit(int n, int x) {
        if(((n) & (1<<x)) != 0)    return 1;
        return 0;
    }
}
