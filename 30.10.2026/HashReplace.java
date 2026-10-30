
package Day10;

import java.util.*;

public class HashReplace {

    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("Initial list of elements:");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Replace value using key
        System.out.println("Updated list of elements:");

        hm.replace(102, "Gaurav");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Replace value using key and old value
        System.out.println("Updated list of elements:");

        hm.replace(101, "Vijay", "Ravi");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Replace all values
        System.out.println("Updated list of elements:");

        hm.replaceAll((k, v) -> "Ajay");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
