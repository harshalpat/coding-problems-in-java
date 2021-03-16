package harshal;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a numnber: ");
		int number = new Scanner(System.in).nextInt();

		isNumberPalindrome(number);
	}
	
	public static void isNumberPalindrome(int n) {
		
		int count = 0;
		int temp = n;
		
		// loop to count the number of digits present in the entered number
		while (temp/10 != 0) {
			count = count + 1;
			temp = temp / 10;
		}
		++count;
		// System.out.println(n);
		 
		// creating new array of count length
		int i[] = new int[count];
		int reverse = 0;
		
		// for loop to store each digit in reverse order in array form
		for (int j = 0; j<count; j++) {
			
			i[j] = n % 10;
			// System.out.println(count);
			n = n / 10;
		}
		// for loop to reverse the original number
		for (int j = 0; j<count; j++) {
			reverse = (reverse * 10) + i[j]; // starting => (0 * 10) + 4 (if input is: 1234)
		}
		System.out.println(reverse);
	}
}
