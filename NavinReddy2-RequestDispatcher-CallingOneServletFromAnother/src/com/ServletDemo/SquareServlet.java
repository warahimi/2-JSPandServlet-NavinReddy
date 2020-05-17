package com.ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is Square Servlet</h1><br>");
		
		//fetching data coming from other servlet
		int sum = (int)req.getAttribute("sum");
		out.println("<h1>The sum is: "+sum+" which comes from AddServlet</h1><br>");
		int sq = sum * sum;
		out.println("<h1>The square is: "+sq+"</h1><br><br>");
		
		out.println("<h1>Number1 is: "+Integer.parseInt(req.getParameter("n1"))+"</h1><br>");
		out.println("<h1>Number2 is: "+Integer.parseInt(req.getParameter("n2"))+"</h1><br>");
		
		
		

		
		
	}
}
