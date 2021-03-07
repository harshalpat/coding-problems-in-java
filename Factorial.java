package harshal;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println(factorial(number));
	}
	public static int factorial(int n) {
		int fac = 1;
		for (int i = 1; i<=n; i++) {
			fac = fac * i;
		}
		return fac;
	}

}
