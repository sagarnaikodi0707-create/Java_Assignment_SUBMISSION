/*1c. Linked List Programs
4. Write a Java program to display elements and their positions in a linked list (using 1_listobj.get(p))
*/

package oneC;

import java.util.*;

public class DisplayPositions {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Display elements with index
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}