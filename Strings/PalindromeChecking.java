class PalindromeChecking{
    public static void main(String[] args) {
        System.out.println(isPalindrome("masm"));
    }
    static boolean  isPalindrome(String str){
        int n  = str.length();
        for(int i=0,j=n-1;i<n;i++,j--){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }

        }
        return true;
    }
}