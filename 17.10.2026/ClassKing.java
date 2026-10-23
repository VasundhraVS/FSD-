package Day2;
public class ClassKing {
		// TODO Auto-generated method stub
      int total_families=5;
      public void idea(){
         System.out.println("Planning your war");
       }
      public static void main(String[] args)
      {
    	  ClassKing war=new ClassKing();
    	  war.idea();
    	  Fam1 a=new Fam1();
    	  a.house();
    	  Fam2 b=new Fam2();
    	  b.home();
      }
}
class Fam1
{
    String idea="New House Plan";
	public void house(){
		System.out.println("Have to build new house");
	}
}
class Fam2
{
	String idea="Buying the car";
	public void home()
	{
		System.out.println("Have to buy a Car");
	}
}
