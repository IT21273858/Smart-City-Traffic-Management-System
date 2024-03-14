package transport_notification_bundle;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import public_transport_bundle.PublicTransportService;
import public_transport_bundle.Vehicle;

public class Notification_Activator implements BundleActivator {

	ServiceReference<?> NotificationService;
	Scanner s = new Scanner(System.in);

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Started Transport Notification Bundle\n\n");
		NotificationService=bundleContext.getServiceReference(PublicTransportService.class.getName());
		PublicTransportService transportService = (PublicTransportService) bundleContext.getService(NotificationService);
		
		System.out.println("\n\nSelect the Bus (enter the bus id)");
		System.out.println("ID:1 Bus AC\n");
		System.out.println("ID:2 Bus NON_AC\n");
		System.out.println("ID:3 Train AC\n");
		System.out.println("ID:4 Train NON_AC\n\n");
		
		
		int Input = s.nextInt();
		String BusName="";
		switch(Input)
		{
		case 1:
			BusName="Bus AC";
			System.out.println("\nYour Selection is "+BusName);
			break;
		case 2:
			BusName="Bus NON_AC";
			System.out.println("\nYour Selection is "+BusName);
			break;
		case 3:
			BusName="Train AC";
			System.out.println("\nYour Selection is "+BusName);
			break;
		case 4:
			BusName="Train NON_AC";
			System.out.println("\nYour Selection is "+BusName);
			break;
			default:
				System.out.println("Your Selection is INVALID");
		}
		
		System.out.println("\n\nServices you Looking for(enter the valid number");
		System.out.println("1: Make Reservation\n");
		System.out.println("2: Get the Schedule\n");
		Input = s.nextInt();
		if(Input == 1)
		{
			System.out.println("Enter the number of seats to reserve :");
			int sert = s.nextInt();
			String remin=transportService.MakeReservation(BusName, sert);
			System.out.println("Remainig Seats"+remin);
			
		}
		else if(Input ==2)
		{
			Vehicle v = transportService.getSchedule(BusName);
			System.out.println("\n\nSchedule for your reservation is "+v.getTime());
			
			
		}
		else
		{
			System.out.println("Operation Terminated");
		}
		
		this.stop(bundleContext);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye from Transport Notificator Subscriber");
	}

}
