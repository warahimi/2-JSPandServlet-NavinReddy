package com.ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	//if we want to perform any task we need methods we can use service()
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req and resp object will be created by tomcat for us we just need make reference of it and pass them as parameter
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int sum = num1+num2;
		System.out.println("The result is : "+sum);
		
		//to print the output in the clients page:
		PrintWriter out = resp.getWriter();
		out.println("<h1>The resulet is: "+sum+"</h1>");
		
	}

}
