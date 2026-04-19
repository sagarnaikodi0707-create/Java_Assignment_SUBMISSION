/* 3b. String Exercise progams
   Q2. Write a Java Program for Counting how many times a substring appears in a main string
    using user defined function countOccurrences()
 */

package ThreeB;
	import java.util.Scanner;

	public class SubstringCount {

	    // User-defined function
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Loop to find occurrences
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move ahead to avoid overlapping
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter main string: ");
	        String mainStr = sc.nextLine();

	        System.out.print("Enter substring: ");
	        String subStr = sc.nextLine();

	        int result = countOccurrences(mainStr, subStr);

	        System.out.println("Substring appears " + result + " times.");

	        sc.close();
	    }
	}

