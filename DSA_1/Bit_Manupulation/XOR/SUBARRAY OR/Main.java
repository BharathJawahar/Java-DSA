public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumOfOrOfSubarray(arr));
    }
    private static int sumOfOrOfSubarray(int[] arr) {
        int sum = 0;
        //Subarrays
        for (int i = 0; i < arr.length; i++) {
            int or = 0;
            for (int j = i; j < arr.length; j++) {
                for (int k=i; k<=j; k++)
                    or |= arr[k]; 
                sum+=or;        
            }    
        }
        return sum;
    }
}