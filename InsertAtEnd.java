/* 1c. Linked List Programs
3. Write a Java program to insert the specified element at the end of a linked list.
( using 1_listobj.offerLast("Pink"))
*/

package oneC;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");

        // Insert at end
        list.offerLast("Pink");

        System.out.println("After insertion: " + list);
    }
}