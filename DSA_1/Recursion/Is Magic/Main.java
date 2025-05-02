// Given a number A, check if it is a magic number or not.

// A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.

public class Main {
    public static void main(String[] args) {
        System.out.println(isMagic(123));
        System.out.println(isMagic(10));
    }    
    public static int isMagic(int x) {
        if(x == 1)  return 1;
        if(x<10)    return 0;
        int y = 0;
        while(x!=0){
            y += x%10;
            x /= 10;
        }
        return isMagic(y);
    }
}
