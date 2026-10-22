package Day1;
import java.util.Scanner;
public class VoteEligibility {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner src=new Scanner(System.in);
       int a=src.nextInt();
       if(a>=18)
       {
    	   System.out.println("Eligible to vote");
       }
       else
       {
    	   System.out.println("Not Eligible to Vote");
       }
	}

}
