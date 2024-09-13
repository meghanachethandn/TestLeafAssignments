package week1.day4;

public class FindIntersectionOfArrays {

	public static void main(String[] args) {
		int a[] = {21,43,53,63,12,98};
		int b[] = {31,42,53,98,100,32};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("The Intersection Of two arrays are :"+a[i]);
				}
			}
		}
	}

}
