public class romanToInteger {
    static int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    static int romanToInt(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currValue = value(s.charAt(i));

            if (i < n - 1 && currValue < value(s.charAt(i + 1))) {
                total -= currValue;
            } else {
                total += currValue;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println(romanToInt("III")); // Output: 3
        System.out.println(romanToInt("LVIII")); // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
