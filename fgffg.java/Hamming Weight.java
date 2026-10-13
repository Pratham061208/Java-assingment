public class Hamming Weight{
public static int hammingWeight(int n) {
int count = 0;
while (n != 0) {
 n &= (n - 1); // Clears the lowest set bit
 count++;
 }
return count;
 }
public static void main(String[] args) {
int n1 = 11;
int n2 = 128;
int n3 = 2147483645;
System.out.println("Input: n = " + n1 + " -> Output: " + hammingWeight(n1));
System.out.println("Input: n = " + n2 + " -> Output: " + hammingWeight(n2));
System.o