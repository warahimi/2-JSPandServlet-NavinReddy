package com.ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//HttpServletRequest and HttpServletResponse are interfaces we careate only the reference of it and the 
		//object is created by tomcat
		//all the infromation/data is passed to Servlet in Request object
		//it will have all the data a server needs
		
		// and all repsonse information goes back to user in the Response object (it can be html page, data, video, image..)
		//it will have all the data a client needs
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int sum = num1+num2;
 		
		//to send data with req object to other servlet
		req.setAttribute("sum", sum);
		
		
		//to call the second Servlet we have 2 options 1-RequestDispatcher 2- Redirect
		
		RequestDispatcher rd = req.getRequestDispatcher("square"); //RequestDispatcher is an interface getRequestDispatcher of req gives us the instance/implementation of it
		rd.forward(req, resp);
	}

}
