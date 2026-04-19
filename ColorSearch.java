/*1b. Array List programs
1. Write a java program for getting different 
colors through ArrayList interface and search whether the color "Red" is available or not */

package oneB;

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding elements
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Checking if "Red" exists
        boolean result = colors.contains("Red");

        System.out.println("Is Red available? " + result);
    }
}