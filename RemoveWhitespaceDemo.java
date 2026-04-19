/* 3b. String Exercise progams
 /* 3b. String Exercise progams
 Q4. Write a Java Program for Checking if a string reads the same backward as forward 
 (ignoring case and punctuation) using user defined function 
 isPalindrome():
 */


package ThreeB;

	import java.util.Scanner;

	public class RemoveWhitespaceDemo {

	    // User-defined function
	    public static String removeWhitespace(String str) {
	        if (str == null) {
	            return null;
	        }

	        // Remove all whitespace characters using regex
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String result = removeWhitespace(input);

	        System.out.println("String after removing whitespace: " + result);

	        sc.close();
	    }
	}
