package com.mtit.traffic_monitoring_bundle;
import java.util.HashMap;


public class TrafficMonitoringImpl_Publisher implements TrafficMonitoring_Publisher{
	
	private HashMap<String, TrafficPattern> routeTrafficList;
	private HashMap<String, CongestionPattern> routeCongestionList;
	

	public TrafficMonitoringImpl_Publisher()
	{
		routeTrafficList = new HashMap<String, TrafficPattern>();
		routeCongestionList = new HashMap<String, CongestionPattern>();
		
		routeTrafficList.put("Route 1",TrafficPattern.HIGH);
		routeTrafficList.put("Route 2",TrafficPattern.MEDIUM);
		routeTrafficList.put("Route 3",TrafficPattern.LOW);
		routeTrafficList.put("Route 4",TrafficPattern.HIGH);
		routeCongestionList.put("Route 1",CongestionPattern.LOW);
		routeCongestionList.put("Route 2",CongestionPattern.HIGH);
		routeCongestionList.put("Route 3",CongestionPattern.LOW);
		routeCongestionList.put("Route 4",CongestionPattern.LOW);
		
	}
	
	@Override
	public TrafficPattern IdentifyTrafficPattern(String routeid) {
		if(this.routeTrafficList.containsKey(routeid))
			return this.routeTrafficList.get(routeid);
		return null;
		
	}

	@Override
	public CongestionPattern IdentifyCogestionPattern(String routeid) {
		if(this.routeCongestionList.containsKey(routeid))
			return this.routeCongestionList.get(routeid);
		return null;
	}

}
