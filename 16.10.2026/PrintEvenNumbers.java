package Day1;
import java.util.Scanner;
public class PrintEvenNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        for(int i=0;i<=a;i++)
        {
        	if(i%2==0)
        	{
        		System.out.println(i);
        	}
        }
	}
}
