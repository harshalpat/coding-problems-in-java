package harshal;

import java.util.Scanner;

public class palindrome {
	
	static String reverse = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the string: ");
		
		String s = new Scanner(System.in).nextLine();
		
		String reverse = isPalindrome(s);
		
		if(s.equals(reverse)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	
	public static String isPalindrome(String str) {
		// char ch[] = str.toCharArray();
		char ch[] = new char[(str.length())];

		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length()-1; i>=0; i--) {
			ch[i] = str.charAt(i);
			// System.out.println(ch[i]);
			sb.append(ch[i]);
		}
		// System.out.println(sb);
		String rev = sb.toString();
		return rev;
		}
}

