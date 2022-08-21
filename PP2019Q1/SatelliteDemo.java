package pp2019q1;

public class SatelliteDemo {

	public static void main(String[] args) {
		ISatellite navigationalSatellite = new NavigationalSatellite("Ravana-01");
		IGeolocation LocationTracker1 = new SatelliteLocation("Sri Lanka");
		ISatellite droneSatellite = new DroneSatellite("Ravana·02");
		IGeolocation LocationTracker2 = new SatelliteLocation("Russia");

		ISatellite[] satelliteArray = new ISatellite[] { navigationalSatellite, droneSatellite };
		IGeolocation[] trackerArray = new IGeolocation[] { LocationTracker1, LocationTracker2 };
		
		Satellitecenter satellitecenter = new Satellitecenter(0,satelliteArray , trackerArray);
		satellitecenter.startService();
		satellitecenter.stopService();
		satellitecenter.locationService();

		Satellitecenter satellitecenter2 = new Satellitecenter(1, satelliteArray, trackerArray);
		satellitecenter2.startService();
		satellitecenter2.stopService();
		satellitecenter2.locationService();
		
	}

}
