class Main {
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.print(checkPalindrome(str, str.length()));
    }
    public static int checkPalindrome(String str, int n) {
        if(n==0)    return 1;
        str = str.toLowerCase();
        if(str.charAt(str.length()-n)!=str.charAt(n-1))    return 0;
        return (1 & checkPalindrome(str, n-1));
    }
}