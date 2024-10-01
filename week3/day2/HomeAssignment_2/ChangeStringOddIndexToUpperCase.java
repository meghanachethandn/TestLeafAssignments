package week3.day2.HomeAssignment_2;

public class ChangeStringOddIndexToUpperCase {

	public static void main(String[] args) {
		String text ="changeme";
		char[] stringToChars = text.toCharArray();
		//char[] stringOddindexToUpper ;
		for(int i=0; i<stringToChars.length; i++) {
			if(i%2!=0) {
				stringToChars[i]=Character.toUpperCase(stringToChars[i]);
			}
		}
		for(Character stringToChar:stringToChars ) {
			System.out.print(stringToChar);
		}

	}

}
