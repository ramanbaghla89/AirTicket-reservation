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

import com.IPProject.data.FlightDAOImpl;
import com.IPProject.model.Flight;


@WebServlet("/FlightController")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FlightDAOImpl flightUtil=null;
	@Override
	
	public void init() throws ServletException {
		super.init();
		flightUtil=new FlightDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String COMMAND= request.getParameter("COMMAND");
			if(COMMAND == null) {
				COMMAND="LIST";
			}
			switch(COMMAND) {
			case "LIST":
				listflights(request,response);
				break; 
			case "SEARCH":
				searchflights(request,response);
				break;
				default:
					listflights(request,response);
					break;
					
			}
			listflights(request,response);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

	private void searchflights(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String from=request.getParameter("searchSource");
		String to=request.getParameter("searchDestination");
		String depart=request.getParameter("searchdeparture");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dep=new Date();
		dep=sdf.parse(depart);

		List<Flight> flightList = flightUtil.searchFlights(from, to, dep);
		if(flightList==null) {
			System.out.println("Doest exist");
		}
		request.setAttribute("FLIGHT_LIST", flightList);
		RequestDispatcher rd=request.getRequestDispatcher("search-result.jsp");
		rd.forward(request, response);
	}

	private void listflights(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Flight> flightList=null;
		request.setAttribute("FLIGHT_LIST", flightList);
		RequestDispatcher rd=request.getRequestDispatcher("flight-list.jsp");
		rd.forward(request, response);
		
	}

}

