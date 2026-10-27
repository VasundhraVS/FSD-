package Day6;
import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50,60};
		int[] copy=Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(copy));
	}

}
