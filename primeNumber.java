package harshal;

import java.util.Scanner;

public class primeNumber {
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.print("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		prime(number);
	}
	
	public static void prime(int n) {
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2)
			System.out.println( "is " +"Prime number");
		else {
			System.out.println("Not a prime number");
		}
	}

}
