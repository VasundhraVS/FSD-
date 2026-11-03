package JDBC_Operations;
import java.sql.*;
public class insert {

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FacePrep",
	            "root",
	            "Vasu@3101"
	        );
		Statement stmt=con.createStatement();
		String sql="INSERT INTO students VALUES (1, 'Arun', 'MBA'),(5, 'Priya', 'MCA'),(26, 'Riya', 'M.com'),(34, 'Ram', 'BCA')";
		int result=stmt.executeUpdate(sql);
		System.out.println("2 record inserted successfully!");
		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}