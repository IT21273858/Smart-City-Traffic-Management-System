package public_transport_bundle;

public interface PublicTransportService 
{
	
	
	public Vehicle getSchedule(String Vehicle_name);
	public String MakeReservation(String Vehicle_name,int numberofSeat);
	

}
