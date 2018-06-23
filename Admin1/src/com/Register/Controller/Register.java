package com.Register.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Register.Buslogic;

import model.com.RegisterModel;

/**
 * Servlet implementation class Register
 */
//@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		if(username != null) {
			int usrname = Integer.parseInt(username);
			String password = request.getParameter("password");
			System.out.println(username);
			RegisterModel RM1 = new RegisterModel();
			RM1.setEmpid(usrname);
			RM1.setPassword(password);
			Buslogic BL1 = new Buslogic();
			boolean login =	BL1.checklogin(RM1);
			if(login) {
				request.getRequestDispatcher("product.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			
		}else {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Empid = request.getParameter("Empid");
		int empid = Integer.parseInt(Empid);
		
		String Empname = request.getParameter("Empname");
	    String Deptname = request.getParameter("dropdownvalue");
	    String DateOfJoining = request.getParameter("DOJ");
	    String ExpireDate = request.getParameter("DOE");
	    String Password = request.getParameter("Password");
	    System.out.println(empid);
	    
	    RegisterModel RM = new RegisterModel();
	    RM.setDeptname(Deptname);
	    RM.setDOE(ExpireDate);
	    RM.setEmpid(empid);
	    RM.setEmpname(Empname);
	    RM.setDOJ(DateOfJoining);
	    RM.setPassword(Password);
	    
	    Buslogic BLs = new Buslogic();
	    BLs.AddtoDB1(RM);
	    
		//doGet(request, response);
	}

}
