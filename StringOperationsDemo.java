/* 2 a. Develop a java program for performing various string operations with different string 
 * handling functions directed as follows String Creation and Basic Operations, Length and
 *  Character Access, String Comparison, String Searching, Substring Operations ,
 *   String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder 
 *   Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()
*/


package Twoa;

public class StringOperationsDemo {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String text = "Java programming is fun";
	        System.out.println("\nIndex of 'programming': " + text.indexOf("programming"));
	        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));
	        System.out.println("Contains 'Java': " + text.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (0 to 4): " + text.substring(0, 4));
	        System.out.println("Substring (5): " + text.substring(5));

	        // 6. String Modification
	        String modified = text.replace("fun", "awesome");
	        System.out.println("\nModified String: " + modified);

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Hello Java   ";
	        System.out.println("\nOriginal: '" + strWithSpaces + "'");
	        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1 + " " + str2;
	        System.out.println("\nConcatenated String: " + concat);
	        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Mango,Orange";
	        String[] fruitArray = fruits.split(",");
	        System.out.println("\nSplitting String:");
	        for (String fruit : fruitArray) {
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
	        int age = 20;
	        String name = "Sagar";
	        String formatted = String.format("My name is %s and I am %d years old.", name, age);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";

	        boolean isValid = email.contains("@") &&
	                          email.contains(".") &&
	                          (email.endsWith(".com") || email.endsWith(".in")) &&
	                          !email.startsWith("@");

	        System.out.println("\nEmail: " + email);
	        if (isValid) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }
	}

