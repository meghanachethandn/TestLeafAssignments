package week1.day4;

public class FindEvenNumber {

	public static void main(String[] args) {
		int maxNumber=20;
		System.out.println("The even number between 1 and 20 are :" );
		for(int i=1;i<=maxNumber;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
