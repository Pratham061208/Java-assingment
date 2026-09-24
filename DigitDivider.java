public class DigitDivider {

    public static int countDigits(int num) {
        int original = num;
        int count = 0;
        int n = Math.abs(num); // handle negative numbers

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    // Example usage
    public static void main(String[] args) {
        int num = 128;
        System.out.println(countDigits(num)); // Output: 3 (1, 2, 8 all divide 128)
    }
}