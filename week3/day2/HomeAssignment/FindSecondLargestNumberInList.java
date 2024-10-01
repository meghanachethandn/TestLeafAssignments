package week3.day2.HomeAssignment;

import java.util.Arrays;

public class FindSecondLargestNumberInList {

	public static void main(String[] args) {
		int[] listOfNumber = {1,13,2,4,6,7,9,23};
		Arrays.sort(listOfNumber);
		
		int secondLargeNumber = listOfNumber[listOfNumber.length-2];
		System.out.println("2nd largest number in any list is :" +secondLargeNumber);

	}

}
