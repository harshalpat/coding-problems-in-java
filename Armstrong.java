package harshal;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		if(Armstrong(number) == number) {
			System.out.println(number +" is an armstrong number");
		}
		else {
			System.out.println(number+" is not an armstrong number");
		}
	}
	
	public static int Armstrong(int n) {
		int temp = 0;
		int count = 0;
		while(n != 0) {
			temp = n % 10;
			n = n / 10;
			count += cube(temp);
		}
		return count;
	}
	public static int cube(int n) {
		return n*n*n;
	}

}
