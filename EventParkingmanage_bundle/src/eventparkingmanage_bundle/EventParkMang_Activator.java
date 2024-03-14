package eventparkingmanage_bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import smartparking_bundle.ISmartPaking;

public class EventParkMang_Activator implements BundleActivator {

	ServiceReference<?> parkingService;

	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Started Event Parking mangement bundle");
		parkingService = bundleContext.getServiceReference(ISmartPaking.class.getName());
		ISmartPaking parkservice = (ISmartPaking) bundleContext.getService(parkingService);
		
		System.out.println("\n\nThe Parking space which is free :"+parkservice.GetAvailableParkingSpace().getSlotid());
		System.out.println("\n\nAssigning Parking...\n\n");
		System.out.println("\n\nAssigned to :"+parkservice.AssignParking().getMaxSlots());
		
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye from Event Parking manager Subscriber");
	}

}
