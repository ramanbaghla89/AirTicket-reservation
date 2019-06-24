package com.IPProject.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.IPProject.data.UserDAOImpl;
import com.IPProject.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserDAOImpl userUtil = null;
	
	
	@Override
	public void init() throws ServletException {
		
		super.init();
		
		userUtil = new UserDAOImpl();
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String COMMAND = request.getParameter("COMMAND");
			if(COMMAND == null) {
				COMMAND="LIST";
			}
			switch(COMMAND) {
			case "LIST":
				listUser(request,response);
				break;
			
			case "ADD":
				addUser(request, response);
				break;
				
			case "USER":
				getUser(request, response);
				break;
				
			case "LOAD":
				loadUser(request,response);
				break;
				
			case "ADDMORE":
				updateUser(request,response);
				break;
				
			case "LOGOUT":
				logOut(request, response);
				break;
			case"TICKET":
				ShowTOLIST(request,response);
				
				default:
					listUser(request,response);
				
				
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}




	private void ShowTOLIST(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("load User chal ra");
				String emailId=request.getParameter("email_id");
				//System.out.println(emailId);
				User user=userUtil.getUser(emailId);
				request.setAttribute("USER", user);
				RequestDispatcher rd=request.getRequestDispatcher("ticket.jsp");
				rd.forward(request, response);
		
	}




	private void listUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<User> userList=userUtil.getUsers();
		//System.out.println("list user chal rha");
		//System.out.println(userList);
		request.setAttribute("USER_LIST", userList);
		RequestDispatcher rd=request.getRequestDispatcher("book_ticket.jsp");
		rd.forward(request, response);
	}


	private void loadUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//System.out.println("load User chal ra");
		String emailId=request.getParameter("email_id");
		//System.out.println(emailId);
		User user=userUtil.getUser(emailId);
		request.setAttribute("USER", user);
		RequestDispatcher rd=request.getRequestDispatcher("personal.jsp");
		rd.forward(request, response);
		
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//System.out.println("update user chal ra");
		String emailId=request.getParameter("email_id");
		String fatherName=request.getParameter("father_name");
		String phone=request.getParameter("phone");
		int adultsNo=Integer.parseInt(request.getParameter("adults_no"));
		int childrenNo=Integer.parseInt(request.getParameter("children_no"));
		int infantsNo=Integer.parseInt(request.getParameter("infants_no"));
		String sex=request.getParameter("sex");
		String dateOfBirth=request.getParameter("dob");
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date dob1=new Date();
		dob1=sdf.parse(dateOfBirth);
		User user=new User(emailId,fatherName, sex, adultsNo, childrenNo, infantsNo, phone, dob1);
		//System.out.println(user);
		userUtil.addOtherDetails(user);
	
		RequestDispatcher rd = request.getRequestDispatcher("card.jsp");
		rd.forward(request, response);
				

		
	}




	private void logOut(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session=request.getSession();
		session.invalidate();
		String message="Log out successfully";
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		request.setAttribute("msg",message);
		rd.forward(request,response);
		
	}




	private void getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("......helllloo....");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		String message=null;
		String resource="login.jsp";

		
		try {
			
			User user = userUtil.getUser(emailId);
			if(user.getPassword().equals(password) && user.getEmailId().equals(emailId)) {
				
				resource = "FlightController";
//				HttpSession session = request.getSession();
//				session.setAttribute("userId", emailId);
				
			}
			else {
				message = "wrong password Try again";
			}
			
		}
		catch (Exception e) {
			message = e.getMessage();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(resource);
		request.setAttribute("msg", message);
		rd.forward(request, response);
		
	}




	private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String message=null;
		String resource="signup.jsp";
		
		User user = new User(emailId, password, firstName, lastName, address);
		
		try {
			userUtil.addUser(user);
			message = "Registered Successfully : Please Login";
			resource = "login.jsp";
		} catch (Exception e) {
			message = e.getMessage();
			System.out.println(message);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(resource);
		request.setAttribute("msg", message);
		rd.forward(request, response);
			
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	doGet(request,response);
}
}

