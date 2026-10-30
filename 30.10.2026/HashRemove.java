
package Day10;

import java.util.*;

public class HashRemove {

    public static void main(String args[]) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(103, "Gaurav");

        System.out.println("Initial list of elements: " + map);

        // Key-based removal
        map.remove(100);

        System.out.println("After key-based removal: " + map);

        // Value-based removal
        map.values().remove("Vijay");

        System.out.println("After value-based removal: " + map);

        // Key-value pair based removal
        map.remove(102, "Rahul");

        System.out.println("After key-value pair based removal: " + map);
    }
}
