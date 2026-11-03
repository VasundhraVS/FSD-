package JDBC_Operations;
import java.sql.*;
public class displaytable {

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FacePrep",
	            "root",
	            "Vasu@3101"
	        );
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM students";

		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {

		    int id = rs.getInt("id");
		    String name = rs.getString("name");
		    String dept = rs.getString("dept");

		    System.out.println(id + " " + name + " " + dept);
		}

		rs.close();
		stmt.close();
		con.close();
		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}