package public_transport_bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle 
{
	//seat//time//route
	private String name;
	private Date date;
	private Route Route;
	private int SeatCapacity;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle(String name,String date, public_transport_bundle.Route route, int seatCapacity) {
		super();
		this.name = name;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.date = sdf.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		Route = route;
		SeatCapacity = seatCapacity;
	}

	public String getTime() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(date);
	}
	
	public void setTime(String time) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.date = sdf.parse(time);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	public Route getRoute() {
		return Route;
	}
	public void setRoute(Route route) {
		Route = route;
	}
	public int getSeatCapacity() {
		return SeatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		SeatCapacity = seatCapacity;
	}
	
	
	

}
