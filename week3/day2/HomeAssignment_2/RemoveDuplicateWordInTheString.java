package week3.day2.HomeAssignment_2;

public class RemoveDuplicateWordInTheString {

	public static void main(String[] args) {
		String text ="We learn java basics as part of java sessions in java week1";
		String[] stringsInWords = text.split(" ");
		int count =0;
		for(int i=0 ; i < stringsInWords.length; i++) {
			for(int j =i+1; j<stringsInWords.length;j++ ) {
				if(stringsInWords[i].equals(stringsInWords[j])) {
					stringsInWords[i]=" ";
					count++;
				}
			}
			}
		if(count >0) {
			System.out.println("Duplicate found and removed , printing modifid array :");
			for(String stringsInWord:stringsInWords) {
				if(stringsInWord!="") {
					System.out.print(stringsInWord +" ");
				}
				else {
					System.out.print("There is no duplicate element in the string");
				}
			}
		}

	}

}
