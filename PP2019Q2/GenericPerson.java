package pp2019q2;

import java.util.ArrayList;

public class GenericPerson {
	
	 public <t extends IPerson> void displayElements(ArrayList<t> arr) {
		 for (t ob : arr) {
			System.out.println(ob.displayDetails());
			 
		}
	}

}
