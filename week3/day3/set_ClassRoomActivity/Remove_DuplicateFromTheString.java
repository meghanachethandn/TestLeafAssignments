package week3.day3.set_ClassRoomActivity;

import java.util.Set;
import java.util.TreeSet;

public class Remove_DuplicateFromTheString {

	public static void main(String[] args) {
		String str = "google";
		char[] strInToChar = str.toCharArray();
		Set<Character> uniqueChar = new TreeSet<Character>();
		
		for(int i=0;i<strInToChar.length;i++) {
			uniqueChar.add(strInToChar[i]);
		}
		System.out.println(uniqueChar);
	}

}