package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreditCardServlet
 */
@WebServlet("/CreditCard")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditCardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String cardNumber=request.getParameter("Card Number");
		String name=request.getParameter("Name on card");
		String expiryMonth=request.getParameter("Month");
		String expiryYear=request.getParameter("Year");
		out.println("Name: " +name+ " <br>Card Number: " +cardNumber+ " <br>Expiry month: " +expiryMonth+"<br> Expiry year: " +expiryYear);
		out.close();
	}

}
