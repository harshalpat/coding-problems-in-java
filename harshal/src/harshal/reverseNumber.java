package harshal;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter a number:");
		int sc = new Scanner(System.in).nextInt();
		int number = sc;
		int rev = reverse(number);
		System.out.println(rev);
	}
	
	public static int reverse(int n) {
		int temp;
		int result=0;
		if (n<10) return result;
		else {
		for (int i=0; i<=n; i++) {
			temp = n % 10;
			result = (result * 10) + temp;
			n = n / 10;
			reverse(n);
		}
		return result;
		}
	}

}
