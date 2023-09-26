package com.gl.jdbc.service;

import java.util.ArrayList;

import com.gl.jdbc.dao.EmployeeDao;
import com.gl.jdbc.model.Employee;

public class EmployeeService {

	EmployeeDao eDao;
	
	public EmployeeService()
	{
		eDao =new EmployeeDao();
	}

	public ArrayList <Employee> getEmployeesSvc()
	{
		return eDao.getEmployees();

	}

}
