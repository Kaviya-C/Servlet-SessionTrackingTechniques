

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	String name = request.getParameter("username");

	out.println("Welcome "+name);
	
	Cookie cookie= new Cookie("users",name);
	
//	out.println(cookie);
	
	response.addCookie(cookie);
	


	out.println("<form action='hello'>");
	out.println("<input type='submit' value='Go'>");
	out.println("</form>");
	
	
	
	
	}

}
