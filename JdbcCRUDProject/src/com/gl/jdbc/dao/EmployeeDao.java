package com.gl.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.gl.jdbc.model.Employee;
import com.gl.jdbc.myconnections.MyConnection;
import com.mysql.cj.xdevapi.Statement;

public class EmployeeDao {

	Connection myCon;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MyConnection mCon;

	public EmployeeDao()
	{
		mCon =new MyConnection();
	}

	public ArrayList<Employee> getEmployees()
	{
		myCon =mCon.getMyConnection();
		ArrayList<Employee> employees =new ArrayList<Employee>();
		try
		{
			String query= "select *from employees";
			stmt = (Statement) myCon.createStatement();
			rs = ((java.sql.Statement) stmt).executeQuery(query);

			String eId,eName,eAddr,ePhone;
			int eSal;
			float eTax;

			while(rs.next())
			{
				Employee employee = new Employee();

				eId = rs.getString(1);
				employee.setEmployeeId(eId);

				eName = rs.getString(2);
				employee.setEmployeeId(eName);

				eAddr = rs.getString(3);
				employee.setEmployeeAddress(eAddr);

				ePhone = rs.getString(4);
				employee.setEmployeePhone(ePhone);

				eSal = rs.getInt(5);
				employee.setEmployeeSalary(eSal);

				eTax = rs.getFloat(6);
				employee.setProfTax(eTax);

				employees.add(employee);
				//employee=new Employee(eId,eName,eAddr,ePhone,eSal);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employees;
	}
}

















