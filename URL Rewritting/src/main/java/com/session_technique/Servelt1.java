package com.session_technique;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servelt1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
	String users=request.getParameter("Name");
	
	PrintWriter out = response.getWriter();
	
	out.println("How are u ? "+users);
	
out.println("<a href='visit?name= "+users+"'>Click This</a>");
	
	
	}
	
}
