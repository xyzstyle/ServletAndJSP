package net.chapter5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletParamTest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3010191426512703853L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("test init parameters<br>");
		Enumeration<String> e=getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()){
			out.println("<br>param name="+e.nextElement());
			
		}
		out.println("<br>");
		out.println("main email is: "+getServletConfig().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("amdin email is: "+getServletConfig().getInitParameter("adminEmail"));
	
	}
	

}
