package allcompo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class allcompo{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Enter Your Details :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		System.out.println("Enter Your Roll No :");
		String rollNo = sc.nextLine();
		System.out.println("Enter Your Email :");
		String email = sc.nextLine();
		System.out.println("Enter Your Password :");
		String password = sc.nextLine();
		System.out.println("Enter Your Date of Birth :");
		String dob = sc.nextLine();
		System.out.println("Enter Your Phone No :");
		String phoneNo = sc.nextLine();
		System.out.println("Enter Your Gender :");
		String gender = sc.nextLine();
		System.out.println("Enter Your Address:");
		String address = sc.nextLine();
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/allCompo","root","Akash@123");  
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO allCompo values(?,?,?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,rollNo);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.setString(5,dob);
			ps.setString(6,phoneNo);
			ps.setString(7,gender);
			ps.setString(8,address);
			
			ps.executeUpdate();			
			System.out.println("Data Inserted Successfully");
		}
		catch (Exception e) {
			System.out.println("Failed to insert data"+e);
		}
		
		
	}
}

/*
create database allCompo;

use allCompo;

create table allCompo(name varchar(255),rollNo varchar(255),email varchar(255),password varchar(255),dob varchar(
255),phoneNo varchar(255),gender varchar(255),address varchar(255));

select * from allCompo;

 */

