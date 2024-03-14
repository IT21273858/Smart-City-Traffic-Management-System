package com.mtit.traffic_monitoring_subscriber;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


public class TrafficSignalOptiActivator implements BundleActivator {

	
	ServiceReference trafficMonitoringServicepubRef;
	

	public void start(BundleContext bundleContext) throws Exception 
	{
		System.out.println("Traffic Signal Optimization Stated");
		trafficMonitoringServicepubRef = bundleContext.getServiceReference();

	}

	public void stop(BundleContext bundleContext) throws Exception {
		
	}

}
