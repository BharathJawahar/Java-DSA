
import java.util.ArrayList;

// You are given two positive numbers A and B . You need to find the maximum valued integer X such that:
// X divides A i.e. A % X = 0
// X and B are co-prime i.e. gcd(X, B) = 1

public class Main {
    public static void main(String[] args) {
        // System.out.println("GCD : " + gcd(100, 75));
        System.out.println(cpFact(30, 12));
        System.out.println(cpFact(5, 10));
        System.out.println(cpFact(572011442, 352495790));
        System.out.println(cpFact(2, 2));
    }
    public static int cpFact(int A, int B) {
        // Prime Factors for B
        ArrayList<Integer> prime_factors = new ArrayList<>();
        int x = A, y = B;
        for(int factor=2; factor*factor<=B; factor++) {
            if(y%factor==0) {
                prime_factors.add(factor);
                while(y%factor==0)
                    y = y/factor;
            }
        }
        System.out.println("Prime factors of " + B);
        for(Integer i : prime_factors) {
            System.out.print(i + " ");
        }

        // Divide A with all Prime Factors for B
        for(int i=0; i<prime_factors.size(); i++) {
            if(x%prime_factors.get(i)==0)
                x /= prime_factors.get(i);
        }
        return x;
    }
    // public static int cpFact(int A, int B) {
    //     for(int i=A; i>0; i--) {
    //         if(A%i==0) {
    //         // System.out.println(i);
    //             if(gcd(i, B)==1)
    //                 return i;
    //         }
    //     }
    //     return 1;
    // }
    // public static int gcd(int a, int b) {
    //     int max = Math.max(a, b), min = Math.min(a, b);
    //     while(max%min>0) {
    //         int rem = max%min;
    //         max = min;
    //         min = rem;
    //     }
    //     return min;
    // }
} 
