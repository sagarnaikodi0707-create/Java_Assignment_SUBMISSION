/* 3a. Develop a java program for performing various string operations with different string
 *  handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String 
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, 
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
 startsWith() and endsWith()
 */

package ThreeA;

public class StringOperations {

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String s1 = "Hello";
	        String s2 = new String("World");
	        System.out.println("String s1: " + s1);
	        System.out.println("String s2: " + s2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of s1: " + s1.length());
	        System.out.println("Character at index 2 in s1: " + s1.charAt(2));

	        // 3. String Comparison
	        String s3 = "hello";
	        System.out.println("\ns1 equals s3: " + s1.equals(s3));
	        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
	        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

	        // 4. String Searching
	        String text = "Java programming is fun";
	        System.out.println("\nIndex of 'programming': " + text.indexOf("programming"));
	        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));
	        System.out.println("Contains 'Java': " + text.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (0 to 4): " + text.substring(0, 4));
	        System.out.println("Substring from index 5: " + text.substring(5));

	        // 6. String Modification
	        String replaced = text.replace("fun", "interesting");
	        System.out.println("\nModified string: " + replaced);

	        // 7. Whitespace Handling
	        String spaced = "   Hello Java   ";
	        System.out.println("\nOriginal: '" + spaced + "'");
	        System.out.println("Trimmed: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String concat1 = s1 + " " + s2;
	        String concat2 = s1.concat(" ").concat(s2);
	        System.out.println("\nUsing + operator: " + concat1);
	        System.out.println("Using concat(): " + concat2);

	        // 9. String Splitting
	        String data = "Apple,Banana,Mango,Orange";
	        String[] fruits = data.split(",");
	        System.out.println("\nSplitting string:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(0, 5, "Hi");
	        sb.delete(2, 3);
	        System.out.println("\nStringBuilder Result: " + sb);

	        // 11. String Formatting
	        String name = "Sagar";
	        int age = 20;
	        String formatted = String.format("My name is %s and I am %d years old.", name, age);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Email Validation using contains(), startsWith(), endsWith()
	        String email = "student@gmail.com";

	        boolean isValid = email.contains("@") &&
	                          email.contains(".") &&
	                          !email.startsWith("@") &&
	                          (email.endsWith(".com") || email.endsWith(".in"));

	        System.out.println("\nEmail: " + email);
	        if (isValid) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }
	}
