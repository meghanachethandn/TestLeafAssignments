package week1.day4;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,9};
		//Array is having n-1 element, but we need n element so adding 1 to length of array
		int n= arr.length+1;
		System.out.println("n value is :" +n);
		//Total sum including missing element is
		int totalSum =(n*(n+1))/2;
		System.out.println("Total sum of an array including missing element is :"+totalSum);
		// Calculating actual sum of array
		int actualSumOfArray=0;
		for(int i=0;i<arr.length;i++) {
			actualSumOfArray+= arr[i];
		}
		//calculating missing number in any array
		
		int MissingNumber = totalSum-actualSumOfArray;
		System.out.println("Missing element in array is :" +MissingNumber);
	}

}
