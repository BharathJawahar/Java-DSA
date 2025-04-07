
public class Main {
    public static void main(String[] arg) {
        System.out.println(power(2, 10));
    }
    public static Long power(int a, int b) {
        if(b==0)    return (long)1;
        // if(b==1)    return (long)a;
        long temp = power(a, b/2);
        if((b&1)==0) {
            return temp*temp;
        }
        else {
            return a*temp*temp;
        }
    }
}
