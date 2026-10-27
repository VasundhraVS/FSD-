package Day4;

public class Static_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s = new Child();
        Child i = new Child(5);
        Child n = new Child("Vasu Hiiiii");
        s.bike();
        // private keyword
        // s.house();
        // static
        Mother.whatsapp();
        System.out.println(Mother.name);
	}
}
class Mother {

    static String name = "Vasu";

    public void bike() {
        System.out.println("This is hondo bike");
    }

    static void whatsapp() {
        System.out.println("Testing.......");
    }

    Mother() {
        System.out.println("This is Default Constructor");
    }

    Mother(int a) {
        System.out.println("This is Parameter Constructor " + a);
    }

    Mother(String s) {
        System.out.println("Welcome! " + s);
    }
}

class Child extends Mother {

    public void bike() {
        super.bike();
        System.out.println("My father brought me a pen");
    }

    Child() {
        super();
        System.out.println("This is son default constructor");
    }

    Child(int a) {
        super(a);
        System.out.println("This is Son Parameter Constructor " + a);
    }

    Child(String s) {
        super(s);
        System.out.println("Welcome! " + s);
    }
}