package Day6;
import java.util.Arrays;
public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10, 20, 30, 40, 50};

        int a=Arrays.binarySearch(arr, 30);

        System.out.println("Index: " + a);
	}

}
