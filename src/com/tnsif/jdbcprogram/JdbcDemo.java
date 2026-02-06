package com.tnsif.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
//		String url="jdbc:postgresql://localhost:5432/TNSproject";
//		String user="postgres";
//		String pwd="root";
		
		//Load Driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		
		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/TNSproject","postgres","root");
		System.out.println("Connection Established");
		
		//Create Statement
		Statement st=con.createStatement();
		
		
		int i=st.executeUpdate("insert into Student values(104,'Ram')");
		System.out.println(i+ " record updated successfully");
		
		//Fetch records
		ResultSet rs=st.executeQuery("select*from Student");
		while(rs.next())
		{
			System.out.println("id=" +rs.getInt(1)+" sname:"+rs.getString(2));
		}
		//Close resources
//		rs.close();
		st.close();
		con.close();

	}

}
