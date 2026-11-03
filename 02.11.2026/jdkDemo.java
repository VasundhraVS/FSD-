package JDBC_Operations;
import java.sql.*;
public class jdkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		// Step 1: Import JDBC package
        // Step 2: Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 3: Establish Connection
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/FacePrep",
            "root",
            "Vasu@3101"
        );

        // Step 4: Create Statement
        Statement stmt = con.createStatement();

        // Step 5: Write CREATE query
        String sql = "CREATE TABLE student (" + 
                         "id INT PRIMARY KEY, " + 
                         "name VARCHAR(50), " + 
                         "age INT)";

        // Step 6: Execute Query
        stmt.executeUpdate(sql);
        System.out.println("Table created successfully!");

        // Step 7: Close Connection
        stmt.close();
        con.close();

    } catch (Exception e) {
        System.out.println("sorry for inconvients. check your connections.");
    }
	}

}