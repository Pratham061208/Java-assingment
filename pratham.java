public class pratham
{
    public static void main(String[] args)
    {

       
        int number = 25;
        double implicitValue = number;

        System.out.println("Implicit conversion:");
        System.out.println("Integer value: " + number);
        System.out.println("Converted double value: " + implicitValue);

    
        double decimal = 45.67;
        int explicitValue = (int) decimal;

        System.out.println("\nExplicit conversion:");
        System.out.println("Double value: " + decimal);
        System.out.println("Converted integer value: " + explicitValue);
    }
}