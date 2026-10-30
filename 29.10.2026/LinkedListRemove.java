
package Day9;

import java.util.*;

public class LinkedListRemove {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Gaurav");
        ll.add("Rahul");

        System.out.println("Initial list of elements: " + ll);

        // Removing the first element
        ll.removeFirst();

        System.out.println("After invoking removeFirst() method: " + ll);

        // Removing the last element
        ll.removeLast();

        System.out.println("After invoking removeLast() method: " + ll);

        // Removing an element at a specific position
        ll.remove(1);

        System.out.println("After invoking remove(index) method: " + ll);

        // Removing a specific element
        ll.remove("Ravi");

        System.out.println("After invoking remove(Object o) method: " + ll);

        // Adding elements again for removeAll demonstration
        LinkedList<String> ll2 = new LinkedList<String>();

        ll2.add("Vijay");

        ll2.add("Gaurav");

        // Removing all matching elements from the first list
        ll.removeAll(ll2);

        System.out.println("After invoking removeAll() method: " + ll);
    }
}
