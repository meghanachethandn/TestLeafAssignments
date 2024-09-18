package week1.day4;

import java.util.Arrays;

public class PrintDuplicateValueInArray {

	public static void main(String[] args) {
		int a[] = {1,8,2,4,5,6,7,6,8,2,1,8};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("The Duplicate value in the array :"+a[i]);
				}
			}
		}

	}

}
