/* 3b. String Exercise progams
 Q4. Write a Java Program for Checking if a string reads the same backward as forward 
 (ignoring case and punctuation) using user defined function 
 isPalindrome():
 */

package ThreeB;

	import java.util.Scanner;

	public class PalindromeCheck {

	    // User-defined function
	    public static boolean isPalindrome(String str) {
	        if (str == null) {
	            return false;
	        }

	        // Remove punctuation and spaces, convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = cleaned.length() - 1;

	        // Compare characters from both ends
	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("The string is a Palindrome.");
	        } else {
	            System.out.println("The string is NOT a Palindrome.");
	        }

	        sc.close();
	    }
	}
