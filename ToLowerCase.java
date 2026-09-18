public class ToLowerCase {
    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String input = "Hello World!";
        String output = toLowerCase(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}