package public_transport_bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublicTransport_Activator implements BundleActivator {

	ServiceRegistration<?> ServicePublish;

	public void start(BundleContext bundleContext) throws Exception 
	{
		System.out.println("Transport Bundle started");
		PublicTransportService TransportService = new PublicTransportServiceImpl();
		ServicePublish = bundleContext.registerService(PublicTransportService.class.getName(), TransportService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ServicePublish.unregister();
		System.out.println("Transport Publisher Stoped");
		
	}

}
