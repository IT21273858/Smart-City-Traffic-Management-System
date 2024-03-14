package smartparking_bundle;

public class ParkingSlot {
	private int MaxSlots;
	private String Slotid;
	private int AvailableCars;
	public ParkingSlot(int maxSlots, String slotid, int availableCars) {
		super();
		MaxSlots = maxSlots;
		Slotid = slotid;
		AvailableCars = availableCars;
	}
	public int getMaxSlots() {
		return MaxSlots;
	}
	public void setMaxSlots(int maxSlots) {
		MaxSlots = maxSlots;
	}
	public String getSlotid() {
		return Slotid;
	}
	public void setSlotid(String slotid) {
		Slotid = slotid;
	}
	public int getAvailableCars() {
		return AvailableCars;
	}
	public void setAvailableCars(int availableCars) {
		AvailableCars = availableCars;
	}
	
	
	

}
