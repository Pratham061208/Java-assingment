public class SupermarketBilling {
    public static void main(String[] args) {
        // Data types
        String item = "Basmati Rice";          // String reference type
        int quantity = 3;                      // whole number
        double pricePerUnit = 249.75;          // decimal price
        char category = 'G';                   // one character
        boolean isMember = true;               // true/false
        byte discountPercent = 5;              // small whole number
        long billNumber = 20261111001L;        // long literal

        // Total before discount
        double total = quantity * pricePerUnit;

        // Apply discount only for loyalty members
        if (isMember) {
            total = total - (total * discountPercent / 100.0);
        }

        // Every Rs. 100 earns one point; explicit cast removes decimal part
        int points = (int) (total / 100);

        // Byte arithmetic: b * 2 becomes int, so cast is required
        byte b = 100;
        byte result = (byte) (b * 2);

        System.out.println("Bill No: " + billNumber);
        System.out.println("Item: " + item);
        System.out.println("Category: " + category);
        System.out.println("Total to pay: Rs. " + total);
        System.out.println("Points earned: " + points);
        System.out.println("byte 100 * 2 = " + result);
    }
}