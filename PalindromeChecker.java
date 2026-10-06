public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer to next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer to previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char cLeft = Character.toLowerCase(s.charAt(left));
            char cRight = Character.toLowerCase(s.charAt(right));

            if (cLeft != cRight) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                     // false
        System.out.println(isPalindrome(""));                               // true
        System.out.println(isPalindrome("0P"));                             // false
    }
}