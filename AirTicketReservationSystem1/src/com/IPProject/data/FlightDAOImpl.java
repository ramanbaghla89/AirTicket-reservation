package com.IPProject.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.IPProject.model.Flight;

public class FlightDAOImpl implements FlightDAO {

		private void close(ResultSet rs, PreparedStatement ps, Connection con) {
			try {
	            if(rs!=null) {
	                rs.close();
	            }
	            if(ps!=null) {
	                ps.close();
	            }
	            if(con!=null) {
	                con.close();
	            }
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
			
		}
	
		@Override
		public List<Flight> getFlights() throws Exception {
			List<Flight> flightList=new ArrayList<>();
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			
			try {
				con=ConnectionFactory.getCon();
				ps=con.prepareStatement("select * from flight_details order by flight_name");
				rs=ps.executeQuery();
				
				while(rs.next()) {
					int flightId=rs.getInt("flight_id");
	            	String flightName=rs.getString("flight_name");
	            	String source=rs.getString("source");
	            	String destination=rs.getString("destination");
	            	String classOfFlight=rs.getString("class");
	            	int priceAdults=rs.getInt("adults_price");
	            	int priceChildren=rs.getInt("children_price");
	            	int priceInfants=rs.getInt("infants_price");
	            	java.util.Date departureDate=rs.getDate("depart_date");
	            	Time departureTime=rs.getTime("depart_time");
	            	String duration=rs.getString("duration");
	            	Flight flight=new Flight(flightId, flightName, source, destination, classOfFlight, priceAdults, priceChildren, priceInfants, departureDate, departureTime, duration);
	            	flightList.add(flight);
										
				}
			}
			finally {
				close(rs,ps,con);
			}
			return flightList;

		}

		@Override
		public List<Flight> searchFlights(String source, String destination, java.util.Date departureDate) throws Exception {
			List<Flight> flightList=new ArrayList<>();
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			Flight flight = null;
			
			try {
				con = ConnectionFactory.getCon();
	            ps = con.prepareStatement("select * from flight_details where source=? and destination=? and depart_date=?");
	            ps.setString(1, source);
	            ps.setString(2, destination);
		        ps.setTimestamp(3, new java.sql.Timestamp(departureDate.getTime()));
	            rs = ps.executeQuery();
	            while (rs.next()) {
	            	int flightId=rs.getInt("flight_id");
	            	String flightName=rs.getString("flight_name");
	            	String classOfFlight=rs.getString("class");
	            	int priceAdults=rs.getInt("adults_price");
	            	int priceChildren=rs.getInt("children_price");
	            	int priceInfants=rs.getInt("infants_price");
	            	int totalPrice=rs.getInt("total_price");
	            	Time departureTime=rs.getTime("depart_time");
	            	String duration=rs.getString("duration");
	            	flight=new Flight(flightId, flightName, source, destination, classOfFlight, priceAdults, priceChildren, priceInfants, totalPrice, departureDate, departureTime, duration);
	            	flightList.add(flight);
	            }
			}finally {
				close(rs,ps,con);
			}
			
			return flightList;
			
		}


}
