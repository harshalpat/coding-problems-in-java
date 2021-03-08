package harshal;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the limit of series: ");
		int number = new Scanner(System.in).nextInt();
		fib(number);
	}
		
	public static void fib (int n) {
		int fib1 = 0;
		int fib2 = 1;
		int temp;
		if(n == 1 || n == 2 ) {
			System.out.println(fib2);
		}
		else{
			for(int i=1; i<=n; i++) {
				temp = fib1 + fib2;
				fib1 = fib2;
				fib2 = temp;
				System.out.println(temp);	
			}
		}
	}
}
