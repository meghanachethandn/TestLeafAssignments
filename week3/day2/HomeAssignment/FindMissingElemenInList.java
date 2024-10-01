package week3.day2.HomeAssignment;

import java.util.Arrays;

public class FindMissingElemenInList {

	public static void main(String[] args) {
		int[] listOfNumbers = {1,11,2,10,3,6,7,9};
		System.out.println(listOfNumbers);
		Arrays.sort(listOfNumbers);
		System.out.println(Arrays.toString(listOfNumbers));
		
		for(int i=0;i<listOfNumbers.length-1;i++) {
			if(listOfNumbers[i+1]-listOfNumbers[i]>1) {
				for(int j=listOfNumbers[i]+1;j<listOfNumbers[i+1];j++) {
					System.out.println(j);
				}
			}
			
		}
	
	}

}
