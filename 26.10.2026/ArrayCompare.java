package Day6;
import java.util.Arrays;
public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30};
		int[] b={10,20,50};
		/*int result=Arrays.compare(a,b);
		System.out.println(result);*/
		for (int i = 0; i < a.length; i++) {

            if (a[i] < b[i]) {
                System.out.println("-1");
                break;
            }
            else if (a[i] > b[i]) {
                System.out.println("1");
                break;
            }
            else if (i == a.length - 1) {
                System.out.println("0");
            }
		}
	}

}
