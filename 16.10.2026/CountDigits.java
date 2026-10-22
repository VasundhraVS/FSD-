package Day1;
import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int a=src.nextInt();
       int count=0;
       for(int i=0;i<=a;i++)
       {
    	   count++;
       }
       System.out.println(count);
	}

}
