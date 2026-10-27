package Day5;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		s.carLoan();
	}
}
abstract class RBI{
	void deposit(){
		System.out.println("Deposit Method");
	}
	void withdrawal(){
		System.out.println("Withdrawal Method");
	}
	abstract void educationLoan();    //unimple or abstract
	abstract void agriLoan();
	
}
class SBI extends RBI{
	void carLoan(){
		System.out.println("ROI 11.25%");
	}
	
	void houseLoan(){
		System.out.println("ROI 13.25%");
	}
	
	void educationLoan(){
		System.out.println("ROI 9%");
	}
	void agriLoan(){
		
	}
}
interface RTO{
	void BS6();
	void DualDiskBreaks();
	void AirBags();
}
class HondoCity implements RTO{
	void RootsHorn(){
		
	}
	void SonyMediaPlayer(){
		
	}
	public void BS6(){
		
	}
	public void DualDiskBreaks(){
		
	}
	public void AirBags(){
		
	}
}