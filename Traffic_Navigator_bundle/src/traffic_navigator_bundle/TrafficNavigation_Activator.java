package traffic_navigator_bundle;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.traffic_monitoring_bundle.CongestionPattern;
import com.mtit.traffic_monitoring_bundle.TrafficMonitoring_Publisher;

public class TrafficNavigation_Activator implements BundleActivator {

	ServiceReference<?> TrafficServiceRef;

	Scanner s = new Scanner(System.in);

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("TrafficNavigor_subscriber started");
		TrafficServiceRef = bundleContext.getServiceReference(TrafficMonitoring_Publisher.class.getName());
		TrafficMonitoring_Publisher TrafficService = (TrafficMonitoring_Publisher) bundleContext.getService(TrafficServiceRef);
		
		
		int input=0;
		while(input!=-1)
		{
			System.out.println(""
					+ "Enter the id of the Route,that you wish to Ride/Hire? :\n"
					+ "ID:1  Route 1\n"
					+ "ID:2  Route 2\n"
					+ "ID:3  Route 3\n"
					+ "ID:4  Route 4\n"
					+ "ID:-1  to Exit the Program 1\n");
			input = s.nextInt();
			if(input == -1)
				break;
			
			String RouteSelected = "";
			switch(input) {
			case 1:
				RouteSelected = "Route 1";
				break;
			case 2:
				RouteSelected = "Route 2";
				break;
			case 3:
				RouteSelected = "Route 3";
				break;
			case 4:
				RouteSelected = "Route 4";
				break;
			default:
				System.out.println("No routes selected");
				
			}
			CongestionPattern TrafficStatus = TrafficService.IdentifyCogestionPattern(RouteSelected);
			
			if(TrafficStatus == CongestionPattern.LOW)
			{
				System.out.println("Congestion in the selecteed route is very low, recommanded:  a high Congestion road");
				continue;
			}
			else
			{
				System.out.println("Congestion is HIGH in your selected route, good luck for the RIDE");
				break;
			}
				

		}
		
		
		
		
		
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye from Traffic Navigator Subscriber");
		
	}

}
