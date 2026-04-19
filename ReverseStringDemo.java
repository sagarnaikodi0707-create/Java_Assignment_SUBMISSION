/*3b. String Exercise progams
 * Q3. Write a Java Program for Reversing the characters in a 
 * string using user defined function reverseString().*/
package ThreeB;
	import java.util.Scanner;

	public class ReverseStringDemo {

	    // User-defined function
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }

	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i); // append characters in reverse
	        }

	        return reversed;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String result = reverseString(input);

	        System.out.println("Reversed String: " + result);

	        sc.close();
	    }
	}