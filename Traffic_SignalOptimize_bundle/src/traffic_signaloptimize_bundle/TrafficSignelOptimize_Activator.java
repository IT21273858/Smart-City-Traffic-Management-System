package traffic_signaloptimize_bundle;

import com.mtit.traffic_monitoring_bundle.TrafficMonitoring_Publisher;
import com.mtit.traffic_monitoring_bundle.TrafficPattern;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class TrafficSignelOptimize_Activator implements BundleActivator {

	ServiceReference<?> TrafficServiceRef;
	Scanner s = new Scanner(System.in);
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("SingleOptimizor_subscriber started");
		TrafficServiceRef = bundleContext.getServiceReference(TrafficMonitoring_Publisher.class.getName());
		TrafficMonitoring_Publisher TrafficPublishers = (TrafficMonitoring_Publisher) bundleContext.getService(TrafficServiceRef);
		int SignalTimeinMin = 0;
		
		int input=0;
		while(input!=-1)
		{
			System.out.println(""
					+ "Enter the id of the Route:\n"
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
			
			
			
			TrafficPattern TrafficStatus = TrafficPublishers.IdentifyTrafficPattern(RouteSelected);
			System.out.println("Traffic status of the "+RouteSelected+" is "+TrafficStatus.toString());
			
			if(TrafficStatus == TrafficPattern.HIGH)
			{
				
				SignalTimeinMin= 60;
			}
			else if(TrafficStatus == TrafficPattern.MEDIUM)
			{
				
				SignalTimeinMin= 40;
			}
			else
			{
				SignalTimeinMin= 30;
			}
			
			System.out.println("Traffic Signal time for the "+RouteSelected+" is changed to "+SignalTimeinMin);
			
			
			
			
			
			
		}
		
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye from Traffic optimizor Subscriber");
		
	}

}
