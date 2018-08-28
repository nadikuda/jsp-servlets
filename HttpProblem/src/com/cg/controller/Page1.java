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
@WebServlet("/Page1")
public class Page1 extends HttpServlet {
	PrintWriter out=null;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get data from req obj (not from url)
  		out=response.getWriter();
  		response.setContentType("text/html");
  		HttpSession session=request.getSession();
  		Object ob=session.getAttribute("custObj");//here ob holds cust obj
  		//CustomerBean cust=(CustomerBean)ob;
  		//String  msg=session.getAttribute("msg").toString();
  		String  msg=(String)session.getAttribute("msg");
  		/*out.println("name is "+cust.getName()+" city is "+cust.getCity());
  		out.println("mobile number is "+cust.getMobile());
  		*/out.println(msg);
  		out.println("<a href='Page2'>page 2</a>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in post - page 1");
		doGet(request, response);
	}

}
