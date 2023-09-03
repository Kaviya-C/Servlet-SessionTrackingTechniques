package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user");
		
		out.println("Welcome "+name);
		
		out.println("<form action='show'>");
		out.println("<input type='hidden' name='uName' value="+name+">");
		out.println("<input type='submit' Value='Go'>");
		out.println("</form>");
		
		
		
	}
}
