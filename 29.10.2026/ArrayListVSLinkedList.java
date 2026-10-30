
package Day9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 100000; i++) {
            list.add("Ravi");
            list.add("jayanth");
            list.remove(0);
        }

        System.out.println("Time taken by ArrayList: "
                + (System.currentTimeMillis() - startTime) + " ms");

        // LinkedList comparison
        startTime = System.currentTimeMillis();

        LinkedList<String> ll = new LinkedList<String>();

        for (int i = 0; i < 100000; i++) {
            ll.add("Ravi");
            ll.add("jayanth");
            ll.remove(0);
        }

        System.out.println("Time taken by LinkedList: "
                + (System.currentTimeMillis() - startTime) + " ms");
    }
}
