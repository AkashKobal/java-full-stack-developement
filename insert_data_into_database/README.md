# Insert data into database using JDBC.
```
package insertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertData {

	private static Scanner sc;

	public static void main(String[] args) throws Exception { // throws Exception is used to handle the exception without using try-catch block
		
	sc = new Scanner(System.in);
	System.out.println("Enter the student details: ");
	System.out.print("Enter the student id: ");
	int id = sc.nextInt();
	System.out.print("Enter the student name: ");
	String name = sc.next();
	System.out.print("Enter the student branch: ");
	String branch = sc.next();
		
	 Class.forName("com.mysql.cj.jdbc.Driver"); // load and register the driver
	 
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc_db", "root", "Akash@123"); // establish the connection
		
	 PreparedStatement ps = connection.prepareStatement("insert into student values('"+id+"','"+name+"','"+branch+"')"); // execute the query")
	
	 int i = ps.executeUpdate(); // execute the query
		if (i > 0) // if the record is inserted successfully then it will return 1 else 0
			System.out.println("Record inserted successfully");
		else
			System.out.println("Record not inserted successfully");
	 
	}

}
```
