package Day2;
import java.util.Scanner;
public class AssignmentOperator {
   public static void main(String[] args)
   {
	   Assignment a=new Assignment();
	   a.bank();
   }
}
class Assignment
{
	public void bank()
	{
		Scanner src=new Scanner(System.in);
		int balance=5000;
		int a;
		do
		{
			System.out.println("Balance:"+balance);
			System.out.println("1.Deposit");
			System.out.println("2.WithDraw");
			System.out.println("3.Exit");
			System.out.println("Enter Your Number:");
			a=src.nextInt();
			switch(a)
			{
			  case 1:
				 System.out.println("Enter Deposit Amount:");
				 int Deposit=src.nextInt();
				 Deposit+=balance;
				 System.out.println("Total Amount Deposited:"+Deposit);
				 break;
			  case 2:
				  System.out.println("Enter Withdraw Amount:");
				  int WithDraw=src.nextInt();
				  WithDraw-=balance;
				  System.out.println("Remaining Balance:"+WithDraw);
				  break;
			  case 3:
				  System.out.println("Exited");
				  break;
			  default:
				  System.out.println("Invalid Output");
				  break;
			}
		}
		while(a!=3);
	}
}
