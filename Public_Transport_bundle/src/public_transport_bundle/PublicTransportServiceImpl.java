package public_transport_bundle;

import java.util.ArrayList;

public class PublicTransportServiceImpl implements PublicTransportService
{
	
	private ArrayList<Vehicle> VehicleList;
	
	public PublicTransportServiceImpl()
	{
		VehicleList = new ArrayList<Vehicle>();
		VehicleList.add(new Vehicle("Bus AC","06/02/2024",Route.ROUTE_1 , 50));
		VehicleList.add(new Vehicle("Bus NON_AC","16/02/2024",Route.ROUTE_2 , 60));
		VehicleList.add(new Vehicle("Train AC","06/02/2024",Route.ROUTE_3 , 10));
		VehicleList.add(new Vehicle("Train NON_AC","06/02/2024",Route.ROUTE_1 , 20));
	}

	@Override
	public Vehicle getSchedule(String Vehicle_name) {
		for(var vehicle : VehicleList)
		{
			if(vehicle.getName() == Vehicle_name)
			{
				return vehicle;
			}
			
		}
		return null;
		
	}

	@Override
	public String MakeReservation(String Vehicle_name, int numberofSeat) {
		for(var vehicle : VehicleList)
		{
			if(vehicle.getName() == Vehicle_name)
			{
				if(vehicle.getSeatCapacity()==0)
				{
					break;
				}
				vehicle.setSeatCapacity(vehicle.getSeatCapacity()-numberofSeat);
				return String.valueOf(vehicle.getSeatCapacity());
				
			}
			
		}
		return "Vehicle not Found";
		
	}
}


	


