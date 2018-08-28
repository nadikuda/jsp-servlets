package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.CustomerBean;

/**
 * Servlet implementation class DataController
 */
@WebServlet("/Data.do")
public class DataController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uName");
		String city=request.getParameter("city");
		String mobile=request.getParameter("mobile");
		//session
		//validate un and pwd against DB
		//then session
		HttpSession session=request.getSession(true);
		session.setMaxInactiveInterval(12);
		System.out.println("in get");
		CustomerBean customer=new CustomerBean(name,city,mobile);
		session.setAttribute("custObj",customer);
		session.setAttribute("msg","welcome to session!!!");
		RequestDispatcher rd=request.getRequestDispatcher("Page1");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String m=request.getMethod();
		System.out.println(m);
		doGet(request, response);
	}

}
