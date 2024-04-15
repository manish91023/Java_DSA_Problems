public class NumberDivisibleBy7 {
    public static void main(String[] args) {
        System.out.println(isDivisibleBy7("364"));
    }

    static boolean isDivisibleBy7(String s) {
        int n=Integer.parseInt(s); // convert string to integer
        if( n < 0 )
            return isDivisibleBy7(String.valueOf(-n));
  
        // Base cases
        if( n == 0 || n == 7 )
            return true;
        if( n< 10 )
            return false;
        int lastDigit = n % 10;
        int remainingNumber = (n / 10);
        return isDivisibleBy7(String.valueOf(remainingNumber - 2 * lastDigit));
    }
}