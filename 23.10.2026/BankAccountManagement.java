package Day5;

public class BankAccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankSample c= new BankSample(101, "Santhu", 10000);
		
		System.out.println("Account Holder:"+c.getAccountHolder());
		System.out.println("Account Holder:"+c.getBalance());
		
		c.deposit(2000);
		c.withdraw(3000);
		
		System.out.println("Available Balance: "+c.getBalance());
		
		c.withdraw(5000);
	}
}
class BankSample{
	private int num;
	private String acc_hold;
	private double bal;
	
	// Constructor
    public BankSample(int num, String acc_hold, double bal) {
        this.num = num;
        this.acc_hold = acc_hold;
        this.bal = bal;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Deposit Amount: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > bal) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            bal -= amount;
            System.out.println("Withdrawal Amount: " + amount);
        }
    }

    // Getter methods
    public double getBalance() {
        return bal;
    }

    public String getAccountHolder() {
        return acc_hold;
    }
}