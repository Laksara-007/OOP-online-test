package pp2019q1;

import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;

public class Satellitecenter {
	int option;
	private ISatellite[] satelliteArray;
	private IGeolocation[] trackerArray;
	
	public Satellitecenter(int option, ISatellite[] satelliteArray, IGeolocation[] trackerArray) {
		
		this.option = option;
		this.satelliteArray = satelliteArray;
		this.trackerArray = trackerArray;
		System.out.println();
		
	}
	
	public void startService() {

		switch (option) {
		case 0: {
				satelliteArray[0].activate();
				break;
			}

		case 1: {
				satelliteArray[1].activate();
				break;
			}

		}
	}
	
	public void stopService() {
		switch (option) {
		case 0:
			satelliteArray[0].deactivate();
			break;
		case 1:
			satelliteArray[1].deactivate();
			break;
		}
	}
	
	 public void locationService() {
		 switch (option) {
			case 0:
				trackerArray[0].displayLocation();
				break;
			case 1:
				trackerArray[1].displayLocation();
				break;
			}
	}
}
