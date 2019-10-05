package com.test.jdbc;
import java.sql.*;


public class TestJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
		String url = "jdbc:mysql://127.0.0.1:3306/new_schema";
		String uName = "root";
		String password = "admin@123";
		String query = "select name from testTable where id =11";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uName,password);
		
		Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
