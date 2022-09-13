package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employeetest {

	public static void main(String[] args) {
		
		try {
			//register driver class
			Class.forName("com.mysql.jdbc.Driver");
			//create connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c1495","root","root");
			//create statement
			Statement st = conn.createStatement();
			//fetch data from table
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			conn.close();			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
