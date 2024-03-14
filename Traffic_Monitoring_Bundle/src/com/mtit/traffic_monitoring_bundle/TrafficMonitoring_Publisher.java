package com.mtit.traffic_monitoring_bundle;

public interface TrafficMonitoring_Publisher 
{
	
	public TrafficPattern IdentifyTrafficPattern(String routeid);
	public CongestionPattern IdentifyCogestionPattern(String routeid);

}
