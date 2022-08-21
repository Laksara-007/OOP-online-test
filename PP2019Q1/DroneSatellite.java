package pp2019q1;

public class DroneSatellite implements ISatellite {
	public String name;

	public DroneSatellite(String name) {
		
		this.name = name;
	}
	
	@Override
	public void activate() {
			System.out.println(name + " Drone satellite activated..");
	}

	@Override
	public void deactivate() {
		System.out.println(name + " Drone satellite deactivated..");
		
	}


}
