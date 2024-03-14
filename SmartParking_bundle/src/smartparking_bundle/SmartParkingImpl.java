package smartparking_bundle;

import java.util.ArrayList;

public class SmartParkingImpl implements ISmartPaking
{
	private ArrayList<ParkingSlot> parkingSlotlist;
	public SmartParkingImpl()
	{
		parkingSlotlist = new ArrayList<ParkingSlot>();
		parkingSlotlist.add(new ParkingSlot(20, "Park A", 0));
		parkingSlotlist.add(new ParkingSlot(30, "Park b", 0));
		
	}

	@Override
	public ParkingSlot GetAvailableParkingSpace() {
		
		for(var parking:parkingSlotlist)
		{
			if(parking.getAvailableCars()==parking.getMaxSlots())
				continue;
			
			return parking;
		}
		return null;
		
	}

	@Override
	public ParkingSlot AssignParking() {
		boolean slotAssigned = false;
		for(var parking:parkingSlotlist)
		{
			if(parking.getAvailableCars()==parking.getMaxSlots())
				continue;
			
			parking.setAvailableCars(parking.getAvailableCars()+1);
			slotAssigned=true;
			return parking;	
		}

		return null;
	}

}
