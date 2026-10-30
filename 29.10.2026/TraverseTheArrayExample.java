package Day9;
import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;
public class TraverseTheArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("Traversing list through list iterator");
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious())
        {
        	String str=list1.previous();
        	System.out.println(str);
        }
        System.out.println("Traversing list through for loop:");
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
	}

}
