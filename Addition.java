public class Addition
{ public static int addDigits(int num) 
    { if (num == 0) 
        return 0; 
        if (num % 9 == 0)
             return 9; 
            return num % 9;   
         } 
         public static void main(String[] args)
          { int num1 = 38;
             int num2 = 0;
              System.out.println("Input: num = " + num1 + " -> Output: " + addDigits(num1));
               System.out.println("Input: num = " + num2 + " -> Output: " + addDigits(num2)); 
               } 
            }