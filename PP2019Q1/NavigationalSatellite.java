package pp2019q1;

public class NavigationalSatellite implements ISatellite {
	public String name;
	@Override
	public void activate() {
		System.out.println(name + " Navsatellite activated..");
	}

	@Override
	public void deactivate() {
		System.out.println(name + " Navsatellite deactivated..");
	}

	public NavigationalSatellite(String name) {
		
		this.name = name;
	}
	
	
	

}
