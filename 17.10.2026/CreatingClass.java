package Day2;
public class CreatingClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        vasu a=new vasu();
        a.add();
        a.sub();
        a.mul();
        a.div();
        Madhu b=new Madhu();
        b.add();
        a.sub();
        a.mul();
        a.div();
	}
}
class vasu
{
	int learn_exp=356;
	public void add()
	{
		System.out.println(learn_exp+100);
	}
	public void sub()
	{
		System.out.println(learn_exp-100);
	}
	public void mul()
	{
		System.out.println(learn_exp*100);
	}
	public void div()
	{
		System.out.println(learn_exp/100);
	}
}
class Madhu
{
	int learn_exp=356;
	public void add()
	{
		System.out.println(learn_exp+100);
	}
	public void sub()
	{
		System.out.println(learn_exp-100);
	}
	public void mul()
	{
		System.out.println(learn_exp*100);
	}
	public void div()
	{
		System.out.println(learn_exp/100);
	}
}