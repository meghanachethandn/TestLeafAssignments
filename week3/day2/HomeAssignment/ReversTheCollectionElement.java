package week3.day2.HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversTheCollectionElement {

	public static void main(String[] args) {
		String[] companiesnames = {"Wipro","HCL","CTS","AspireSystem"};
		List<String> namesList = new ArrayList<String>();
		List<String> reversnamesList = new ArrayList<String>();
		
		//Storing String array element to Array list
		for(String companies:companiesnames ) {
			namesList.add(companies);
		}
		System.out.println(namesList);
		
		// reversing the list of collection
		
		for(int i=namesList.size()-1;i>=0;i--) {
			reversnamesList.add(namesList.get(i));		
		}
		System.out.println(reversnamesList);

		
		
		

	}

}
