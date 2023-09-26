package com.gl.jdbc.myconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	Connection con;
	String  user="root";
	String password = "Kia@1T";

	//http://wwwrediff.com
	String url ="jdbc:mysql://localhost:3306/javajdbc";


	public Connection getMyConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);
		 }
		catch(ClassNotFoundException cfe)
		{
			cfe.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();

		}
		return con;
	}
}
