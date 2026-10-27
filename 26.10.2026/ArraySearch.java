package Day6;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={101, 102, 103, 104, 105, 106};
		int Search=106;
	    boolean found=false;
		for(int i=0; i<num.length; i++){
			if(num[i]==Search){
				System.out.println("Roll number found");
				int a=i+1;
				System.out.println("Position: "+a);
				found=true;
				break;
			}
		}
		if(found==false){
			System.out.println("Roll number not found");
		}
	}

}
