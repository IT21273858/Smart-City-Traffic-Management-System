package smartparking_bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class SmartParking_Activator implements BundleActivator {

	ServiceRegistration<?> parkingPublisher;
	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Parking Bundle started");
		ISmartPaking parkingObj = new SmartParkingImpl();
		parkingPublisher = bundleContext.registerService(ISmartPaking.class.getName(), parkingObj, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		parkingPublisher.unregister();
		System.out.println("Transport Publisher Stoped");
	}

}
