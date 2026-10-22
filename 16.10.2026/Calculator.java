package Day1;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        char op=src.next().charAt(0);
        switch(op)
        {
          case '+':
        	  System.out.println(a+b);
        	  break;
          case '-':
        	  System.out.println(a-b);
        	  break;
          case'*':
        	  System.out.println(a*b);
        	  break;
          case'/':
        	  System.out.println(a/b);
        	  break;
          default:
        	  System.out.println("check the symbol");
        	  break;
        }
	}

}
