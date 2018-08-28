package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.CustomerBean;

/**
 * Servlet implementation class Page1
 */
@WebServlet("/Page3")
public class Page3 extends HttpServlet {
	PrintWriter out=null;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get data from req obj (not from url)
  		out=response.getWriter();
  		response.setContentType("text/html");
  		HttpSession session=request.getSession();
  		Object ob=session.getAttribute("custObj");//here ob holds cust obj
  		String  msg=(String)session.getAttribute("msg");
  		//String  msg=session.getAttribute("msg").toString();
  		out.println(msg);
  		/*CustomerBean cust=(CustomerBean)ob;
  		out.println("name is "+cust.getName()+" city is "+cust.getCity());
  		out.println("mobile number is "+cust.getMobile());
  		*/out.println("<a href='Page4'>page 4</a>");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
