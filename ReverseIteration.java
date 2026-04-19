/*1c. Linked List Programs
2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
 */

package oneC;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Reverse iterator
        Iterator<String> iterator = list.descendingIterator();

        System.out.println("Reverse order:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}