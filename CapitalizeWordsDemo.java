/* 3c. String Exercise progams
  Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined 
 function capitalizeWords()  */


package ThreeC;

	import java.util.Scanner;

	public class CapitalizeWordsDemo {

	    // User-defined function
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        String[] words = str.toLowerCase().split("\\s+"); // split by whitespace
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter + remaining letters
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1))
	                      .append(" ");
	            }
	        }

	        return result.toString().trim(); // remove trailing space
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();

	        String output = capitalizeWords(input);

	        System.out.println("Capitalized String: " + output);

	        sc.close();
	    }
	}
