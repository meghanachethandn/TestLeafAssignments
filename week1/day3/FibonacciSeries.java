package week1.day3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tearms in fibonacci series : ");
		int inputRange = sc.nextInt();
		int firstValue = 0;
		int secondValue = 1;
		System.out.println("The Fibonacci Series up to " + inputRange + " terms");
		for (int i = 1; i <= inputRange; i++) {
			System.out.println(firstValue);
			int nextFibo = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = nextFibo;
		}
	}

}
