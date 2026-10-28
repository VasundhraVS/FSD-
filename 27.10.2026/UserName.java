package Day7;
import java.util.Scanner;
public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter username: ");
	        String username = sc.nextLine();

	        int length = username.length();
	        boolean containsSpace = username.contains(" ");

	        System.out.println("Username: " + username);
	        System.out.println("Length: " + length);
	        System.out.println("Contains spaces: " + (containsSpace ? "Yes" : "No"));

	        if (length >= 5 && !containsSpace) {
	            System.out.println("Username status: Valid");
	        } else {
	            System.out.println("Username status: Invalid");
	        }
	}
}
