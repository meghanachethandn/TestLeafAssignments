package week1.day4;

public class PrintTheNumbers {
	
	int maxValue =20;
	public void printValueInForwardOrder() {
		for(int i=0;i<=maxValue;i++) {
			System.out.println(i);
		}
		
	}
	public void printValueInReversOrder() {
		for(int j=maxValue;j>0;j--) {
			System.out.println(j);
		}
		
	}
	public static void main(String[] args) {
		
		PrintTheNumbers ptn= new PrintTheNumbers();
		System.out.println("Series of number from 0 to 20 in forward order :");
		ptn.printValueInForwardOrder();
		
		System.out.println("Series of number from 0 to 20 in Revers order :");
		ptn.printValueInReversOrder();	
	}

}
