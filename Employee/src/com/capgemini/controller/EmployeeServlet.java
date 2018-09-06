package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/getEmployeeDetails")
public class EmployeeServlet extends HttpServlet {
	
		
	private static final long serialVersionUID = 1L;
	ArrayList<Employee> emp=new ArrayList<>();

 @Override
public void init() throws ServletException {
	
	Employee employee1=new Employee(101,"jon",1000,"CSE");
	Employee employee2=new Employee(102,"jane",1000,"CSE");
	Employee employee3=new Employee(103,"doe",1000,"CSE");
	Employee employee4=new Employee(104,"sachin",1000,"CSE");
	Employee employee5=new Employee(105,"kye",1000,"CSE");
	emp.add(employee1);
	emp.add(employee2);
	emp.add(employee3);
	emp.add(employee4);
	emp.add(employee5);
	}

	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
    }
   int count=0;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=request.getParameter("empid");
		for(Employee empx:emp )
		{
			int empNum=Integer.parseInt(id);
			if(empx.EmployeeNumber==empNum)
			{
				count=1;
				 out.println(" <h1>Employee Details</h1>");
			     out.println("<table border='1' bgcolor='#00FF00' ><tr><thName</th><th>Name</th><th>Department</th><th>Salary</th></tr>");
			     out.println("<tr><td>" +empx.getName()+ "</td><td>" +empx.getNameOfDepartment() +"<td>"+empx.getSalary() +"</td>");
				
			}
		}
		if(count==0)
		 out.println("Not found");
		

		
		
	}

}
