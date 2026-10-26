package Day3;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        bank s=new bank();
        s.num=101;
        s.balance=50000;
        s.show();
        System.out.println();
        
        current c=new current();
        c.num=102;
        c.balance=2000;
        c.Show();
	}
}
class saving
{
	int num;
	int balance;
	void display()
	{
	  System.out.println("Account Number:"+num);
	  System.out.println("Balnce:"+balance);
	}
}
class bank extends saving
{
	void show()
	{
		System.out.println("Saving Amount");
		display();
	}
}
class current extends bank
{
	void Show()
	{
		System.out.println("Current Amount");
		display();
	}
}
