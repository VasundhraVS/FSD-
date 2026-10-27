package Day5;

public class HDFC_Get_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gpay g = new Gpay();

        g.setAcc_number(1011234);
        g.setAcc_balance(1100000);
        g.setAcc_holder_name("Santhu");
        g.setAcc_holder_email("SanthiyaP@gmail.com");

        System.out.println("Account Number: " + g.getAcc_number());
        System.out.println("Account Holder Name: " + g.getAcc_holder_name());
        System.out.println("Account Balance: " + g.getAcc_balance());
        System.out.println("Email: " + g.getAcc_holder_email());
	}
}
class HDFC{

    private long acc_number;
    private long acc_balance;
    private String acc_holder_name;
    private String acc_holder_email;

    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public void setAcc_balance(long acc_balance) {
        this.acc_balance = acc_balance;
    }

    public long getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public void setAcc_holder_email(String acc_holder_email) {
        this.acc_holder_email = acc_holder_email;
    }
    
    public String getAcc_holder_email() {
        return acc_holder_email;
    }
}
class Gpay extends HDFC{
	
}