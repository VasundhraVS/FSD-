package Day2;
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner src=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=src.nextInt();
        System.out.println("Enter Your Mark:");
        int mark=src.nextInt();
        Exam a=new Exam();
        a.eligible(age,mark);
	}
}
class Exam
{
	public void eligible(int age,int mark)
	{
		if((age>=18)&&(mark>=50))
		{
			System.out.println("Eligible:"+"True");
		}
		else if((age>=18)||(mark<50))
		{
			System.out.println("Eligible:"+"False");
		}
		else if(!(age>=18))
		{
			System.out.println("Eligible in Age"+"False");
		}
		else
		{
			System.out.println("You have to wait"+age+"years and have to increase your mark more than 50");
		}
	}
}