package com.gl.jdbc.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.gl.jdbc.model.Employee;
import com.gl.jdbc.service.EmployeeService;

public class EmployeeDBManager {
	Connection mycon;
	Statement stmt;
	ResultSet rs;
	String reply = "yes";
	Scanner scan=new Scanner(System.in);
	int choice;
	EmployeeService eService;

	public EmployeeDBManager()
	{
		eService = new EmployeeService();
	}

	public void displayMenu()
	{
		while(reply.equals("yes") ||(reply.equals("Yes")))
		{
			System.out.println("------- Main Menu-------");
			System.out.println("1.Veiw Employee...");
			System.out.println("2.Veiw Employee By ID...");
			System.out.println("3.Insert Employee...");
			System.out.println("4.Modify Employee...");
			System.out.println("5.Exit Application...");
			System.out.println("Enter your choice...");

			choice=scan.nextInt();

			switch(choice)
			{
			case 1:
			{
				System.out.println("viewing Employee");
				ArrayList<Employee> employees = eService.getEmployeesSvc();

				Iterator <Employee> eIter = employees.iterator();
				System.out.println("The Employees are");
				while(eIter.hasNext())
				{
					Employee e=eIter.next();
					System.out.println(e);
				}

				break;
			}
			case 2:
			{
				System.out.println("viewing Employee By Id");
				break;
			}
			case 3:
			{
				System.out.println("Inserting Employees");
				break;
			}
			case 4:
			{
				System.out.println("updating employee");
				break;
			}
			case 5:
			{
				System.out.println("Deleting Employee By Id");
				break;
			}
			case 6:
			{
				System.out.println("Exiting Application");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println(" Sorry allowed options are 1-6");
				break;
			}
			}
			System.out.println("Do you wish to cotinue yes/no");  
			reply=scan.next(); 

		}
		System.out.println("Exited Application");
	}
}