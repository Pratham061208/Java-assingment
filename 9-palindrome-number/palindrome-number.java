class Solution {
    public boolean isPalindrome(int x) {
       
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Even length: x == reversedHalf
        // Odd length: the middle digit is in reversedHalf, so drop it with / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}