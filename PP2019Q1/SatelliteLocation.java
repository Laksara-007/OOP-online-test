package pp2019q1;

public class SatelliteLocation implements IGeolocation {
	public String location;
	
	@Override
	public void displayLocation() {
		System.out.println(location);
		
	}
	public SatelliteLocation(String location) {
		
		this.location = location;
	}
	

}
