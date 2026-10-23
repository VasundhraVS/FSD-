package Day2;
import java.util.Scanner;

public class ArthimeticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Arithmetic a=new Arithmetic();
          a.add();
          a.sub();
          a.mul();
          a.div();
	}

}
class Arithmetic
{
	Scanner src=new Scanner(System.in);
	int a=src.nextInt();
	int b=src.nextInt();
	public void add()
	{
		System.out.println("Addition Value is "+(a+b));
	}
	public void sub()
	{
		System.out.println("Subraction Value is "+(a-b));
	}
	public void mul(){
		System.out.println("Multiplication Value is "+(a*b));
	}
	public void div()
	{
		System.out.println("Division Value is "+(a/b));
	}
}
