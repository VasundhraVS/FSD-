package Day6;
import java.util.Arrays;
public class ArrayMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30,40};
		int[] b={10,20,30,50};
		//System.out.println(Arrays.mismatch(a,b));
		for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                System.out.println(i);
                break;
            }
        }
	}

}
