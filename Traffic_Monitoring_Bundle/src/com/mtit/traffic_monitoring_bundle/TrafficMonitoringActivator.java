package com.mtit.traffic_monitoring_bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class TrafficMonitoringActivator implements BundleActivator {

	ServiceRegistration<?> ServicePublisher;
	

	public void start(BundleContext bundleContext) throws Exception 
	{
		System.out.println("Traffic Producer started");
		TrafficMonitoring_Publisher TrafficService = new TrafficMonitoringImpl_Publisher();
		ServicePublisher = bundleContext.registerService(TrafficMonitoring_Publisher.class.getName(), TrafficService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ServicePublisher.unregister();
		System.out.println("Traffic Publisher Stoped");
		
	}

}
