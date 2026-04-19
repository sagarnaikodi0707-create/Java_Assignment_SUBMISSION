/* 1c. Linked List Programs
5. Write a Java program that swaps two elements (first and third elements) in a linked list 
   (using Collections.swap(1_list, 0, 2))
*/

package oneC;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Swapping first and third elements
        Collections.swap(list, 0, 2);

        System.out.println("After swapping: " + list);
    }
}