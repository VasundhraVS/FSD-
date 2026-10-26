package Day3;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        calculator c=new calculator();
        c.dist(10,20);
        c.dist(10,20,30);
        c.dist(10,0.20,30);
        c.dist("Vasundhra");
	}
}
class calculator
{
	void dist(int a,int b)
	{
		System.out.println(a+b);
	}
	void dist(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void dist(int a,double b,int c)
	{
		System.out.println(a+b+c);
	}
	void dist(String name)
	{
		System.out.println(name);
	}
}
