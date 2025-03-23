
import java.util.regex.Matcher;
import javax.crypto.Mac;

public class Main {
    public static void main(String[] args) {
        System.out.println(nthMagicNumber(10));
    }    
    public static int nthMagicNumber(int n) {
        int magic_number=0, power=5;
        while(0<n){
            if((n&1)!=0) {
                magic_number+=power;
            }
            power *= 5;
            n = n>>1;
        // System.out.println(magic_number);
    }
        return magic_number;
    }
}
