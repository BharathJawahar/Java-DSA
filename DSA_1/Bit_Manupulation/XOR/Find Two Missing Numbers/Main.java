public class Main {
    public static void main(String[] args) {
        int[] arr = {7,1,6,9,3,8,5};
        find2missingbumbers(arr);
    }
    private static int[] find2missingbumbers(int[] arr) {
        int n = arr.length, xor = 0;
        for(int i=0; i<n; i++) {
            xor ^= i+1;
            xor ^= arr[i];
        }
        xor^=n+1;
        xor^=n+2;
        int ith_bit = 0;
        for(int i=0; i<32; i++) {
            if((xor&(1<<i))!=0) {
                ith_bit = i;
                break;
            }
        }
        int xor_1=0, xor_2=0;
        for(int i=0; i<n; i++) {
            if(((i+1)&(1<<ith_bit))!=0)    xor_1^=i+1;
            else    xor_2^=i+1;
            if((arr[i]&(1<<ith_bit))!=0)    xor_1^=arr[i];
            else    xor_2^=arr[i];
        }
        for(int i=n+1; i<=n+2; i++) {
            if((i&(1<<ith_bit))!=0)    xor_1^=i;
            else    xor_2^=i;
        }
        System.out.println(xor_1);
        System.out.println(xor_2);
        return arr;
    }
}
