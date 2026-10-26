package Day3;

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mother m=new Mother();
         m.motorcycle();
         
         daughter1 d1=new daughter1();
         d1.cycle();
         
         daughter2 d2=new daughter2();
         d2.motorcycle();
         System.out.println(d2.sbi);
	}
}
class Mother
{
	int sbi=100000;
	void motorcycle()
	{
	    System.out.println("getting scooter from father class");
	}
}
class daughter1 extends Mother
{
	int sbi=1000;
	void cycle()
	{
		System.out.println("cycle got from class");
	}
}
class daughter2 extends Mother
{
	int sbi=1000;
	void motorcycle()
	{
		System.out.println("motorcycle got from my daughter class");
	}
}