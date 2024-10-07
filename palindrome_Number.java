public class palindrome_Number {
    public static boolean isPalindrome(int x) {
        // if x is negative number
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            // Get the last digit and add the reversed number
            reversed = reversed * 10 + x % 10;
            // remove the last digit from x
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 12321;
        int x4 = 10;
        int x5 = 101;

        System.out.println(isPalindrome(x1)); // Output: true
        System.out.println(isPalindrome(x2)); // Output: false
        System.out.println(isPalindrome(x3)); // Output: true
        System.out.println(isPalindrome(x4)); // Output: false
        System.out.println(isPalindrome(x5)); // Output: true
    }
}