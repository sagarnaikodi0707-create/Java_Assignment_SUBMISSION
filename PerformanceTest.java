/* 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
 *  appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. 
 *  Justify your answer which one is better. */


package Twob;

public class PerformanceTest {
	    public static void main(String[] args) {

	        int iterations = 10000;

	        // 1. StringBuffer Performance Test
	        StringBuffer sbuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            sbuffer.append("AIET");
	        }

	        long endBuffer = System.nanoTime();
	        long timeBuffer = endBuffer - startBuffer;

	        // 2. StringBuilder Performance Test
	        StringBuilder sbuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            sbuilder.append("AIET");
	        }

	        long endBuilder = System.nanoTime();
	        long timeBuilder = endBuilder - startBuilder;

	        // Output Results
	        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

	        // Comparison
	        if (timeBuilder < timeBuffer) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}
