package Day1;
import java.util.Scanner;
public class Divisibility {
	public static void main(String[] args)
	{
       Scanner src=new Scanner(System.in);
       int a=src.nextInt();
       if(a%5==0)
       {
    	System.out.println(a+" is divisible by 5");
       }
       else
       {
    	   System.out.println("It is not divisible by 5");
       }
	}
}
