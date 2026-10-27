package Day5;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Epay e=new Epay();
				e.display();
				e.balance=200000;
				System.out.println(e.balance);
	}
}
class Bank{
	String name="Vasundhra";
	String type="Savings";
	String email="vasuvs3101@gmail.com";
	long balance=55000;
	void display(){
		System.out.println(balance);
	}	
}
class Epay extends Bank{
	
}