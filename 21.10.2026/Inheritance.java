package Day3;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         father f=new father();
         f.scooter();
         
         daughter d=new daughter();
         d.cycle();
	}
}
class father
{
	int sbi=100000;
	void scooter()
	{
		System.out.println("Getting scooter from father class");
	}
}
class daughter
{
	int hdfc=1000;
	void cycle()
	{
		System.out.println("cycle got from daughter class");
	}
}
