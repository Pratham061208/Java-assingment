public class SecondLargest {
    public static int findSecondLargest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No distinct second-largest element exists.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        System.out.println("Second largest: " + findSecondLargest(numbers));
    }
}