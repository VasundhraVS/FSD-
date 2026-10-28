package Day7;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Santhiya";   //1011
		String f="Santhiya";
		System.out.println(s.equals(f));
		
		//s.concat("Rabins");     //Pool, Immutable
		System.out.println(s);
		
		//String buffer
		StringBuffer sb=new StringBuffer("va");
		StringBuffer sb1=new StringBuffer("va");
		StringBuilder sb2=new StringBuilder("va");
		
		sb.append("su");
		System.out.println(sb);
		System.out.println(sb.equals(sb1));
	}

}
