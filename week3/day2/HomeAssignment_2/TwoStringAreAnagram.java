package week3.day2.HomeAssignment_2;

import java.util.Arrays;

public class TwoStringAreAnagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "tposs";
		if(text1.length()!=text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else {
			char[] charArray1=text1.toCharArray();
			char[] charArray2=text2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("The String are an Anagram");
			}
			else {
				System.out.println("The String are not an Anagram");
			}
			
		}
		

	}

}
