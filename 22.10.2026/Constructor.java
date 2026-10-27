package Day4;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		son i=new son(5);
		son n=new son("Prathibaa Hiiiii");
		s.bike();
	}
}
class Father{
	String name="Prathi";
	public void bike(){
		System.out.println("This is hondo bike");
	}
	Father(){
		System.out.println("This is Default Constructor");
	}
	Father(int a){
		System.out.println("This is Parameter Constructor "+a);
	}
	Father (String s){
		System.out.println("Welcome! "+s);
	}
}

class son extends Father{
	public void bike(){
		super.bike();
		System.out.println("My father brought me a pen");
	}
	son(){
		super();
		System.out.println("This is son default constructor");
	}
	son(int a){
		super(a);
		System.out.println("This is Son Parameter Constructor "+a);
	}
	son (String s){
		super(s);
		System.out.println("Welcome! "+s);
	}
}