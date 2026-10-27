package Day6;
import java.util.Arrays;
public class ArrayEvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={12, 8, 24, 10, 15, 30, 18, 5};
		int even=0;
		int odd=0;
		for(int i=0; i<num.length; i++ ){
			if(num[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even Count: "+even);
		System.out.println("Odd Count: "+odd);
	}

}
