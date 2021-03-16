package harshal;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter a year: ");
		int year = new Scanner(System.in).nextInt();
		isLeapYear(year);
	}
	
	public static void isLeapYear(int y) {
		if(y % 4 == 0)
			System.out.println(y + " is a leap year!");
		else{
			System.out.println(y + " is not a leap year!");
		}
	}

}
