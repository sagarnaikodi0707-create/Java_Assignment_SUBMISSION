/*1c. Linked List Programs
1. Write a Java program to iterate through all elements in a linked list starting at the specified
   position (2nd) using iterator (hint: Iterator iteratorobj = listobj.listIterator(1))
*/

package oneC;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Starting iterator from index 1
        Iterator<String> iterator = list.listIterator(1);

        System.out.println("Elements from 2nd position:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}