package com.IPProject.model;



import java.sql.Time;
import java.util.Date;

public class Flight {
	private int flightId;
	private String flightName;
	private String source;
	private String destination;
	private String classOfFlight;
	private int priceAdults;
	private int priceChildren;
	private int priceInfants;
	private int totalPrice;
	private Date departureDate;
	private Time departureTime;
	private String duration;
	
	public Flight(int flightId, String flightName, String source, String destination, String classOfFlight,
			int priceAdults, int priceChildren, int priceInfants, int totalPrice, Date departureDate,
			Time departureTime, String duration) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.classOfFlight = classOfFlight;
		this.priceAdults = priceAdults;
		this.priceChildren = priceChildren;
		this.priceInfants = priceInfants;
		this.totalPrice = totalPrice;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.duration = duration;
	}
	

	public Flight(int flightId, String flightName, String source, String destination, String classOfFlight,
			int priceAdults, int priceChildren, int priceInfants, Date departureDate, Time departureTime,
			String duration) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.classOfFlight = classOfFlight;
		this.priceAdults = priceAdults;
		this.priceChildren = priceChildren;
		this.priceInfants = priceInfants;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.duration = duration;
	}



	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getClassOfFlight() {
		return classOfFlight;
	}

	public void setClassOfFlight(String classOfFlight) {
		this.classOfFlight = classOfFlight;
	}

	public int getPriceAdults() {
		return priceAdults;
	}

	public void setPriceAdults(int priceAdults) {
		this.priceAdults = priceAdults;
	}

	public int getPriceChildren() {
		return priceChildren;
	}

	public void setPriceChildren(int priceChildren) {
		this.priceChildren = priceChildren;
	}

	public int getPriceInfants() {
		return priceInfants;
	}

	public void setPriceInfants(int priceInfants) {
		this.priceInfants = priceInfants;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", source=" + source + ", destination="
				+ destination + ", classOfFlight=" + classOfFlight + ", priceAdults=" + priceAdults + ", priceChildren="
				+ priceChildren + ", priceInfants=" + priceInfants + ", totalPrice=" + totalPrice + ", departureDate="
				+ departureDate + ", departureTime=" + departureTime + ", duration=" + duration + "]";
	}
	
	
	
	
}
