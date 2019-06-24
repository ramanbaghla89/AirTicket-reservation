package com.IPProject.data;

import java.util.Date;
import java.util.List;

import com.IPProject.model.Flight;

public interface FlightDAO {
	
	public List<Flight> getFlights() throws Exception;
	public List<Flight> searchFlights(String source, String destination, Date departureDate) throws Exception;

}
