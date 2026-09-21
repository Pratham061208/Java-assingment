public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n &= (n - 1); // Clears the lowest set bit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 11;

        System.out.println(hammingWeight(n)); // Output: 3
    }
}