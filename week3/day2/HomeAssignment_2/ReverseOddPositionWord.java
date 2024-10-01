package week3.day2.HomeAssignment_2;

public class ReverseOddPositionWord {

	public static void main(String[] args) {
		String statement = "I am a software tester";
		// Spliting a String by Space
		String[] statementWords = statement.split(" ");
		
	/*	for(String statementWord:statementWords) {
			System.out.println(statementWord);
		}*/
		//Iterate throught words
		for(int i=0; i<statementWords.length; i++) {
			//Checking condition is position is odd or not, if yes going inside the loop
			if(i%2!=0) {
				// Converting word to charter
				char[] oddWord = statementWords[i].toCharArray();
				//Iterating words and reversing the word
				for(int j=oddWord.length-1; j>=0; j--) {
					System.out.print(oddWord[j]);	
				}
				System.out.print(" ");
			}
			else {// If not print even position word
				System.out.print(statementWords[i]+" ");
			}
		}

	}

}
